import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         int[] numbers ={1,3,5,7,9,11,13};
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int steps=0;
            int flag=0;

            for(int i=0;i<=(numbers.length)-1;i++){
                steps++;
                if(numbers[i]==target){
                    System.out.println("Number of steps "+steps);
                    System.out.println("target found at index "+i);
                    flag=1;
                }
            }
            if(flag==0)
            System.out.println("Not found");
        }   
    }
}
