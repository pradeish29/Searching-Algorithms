import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,7,9,11,13};
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int steps=0;
            int left =0;
            int right= numbers.length-1;
            
            while(left<=right){
                int mid = (left+right)/2;
                steps++;

                if(target==numbers[mid]){
                    System.out.println("target found at index "+(mid));
                    System.out.println("Number of steps "+steps);
                    break;
                }
                else if(target<numbers[mid]){
                    right=mid-1;
                }
                 else {
                    left=mid+1;
                }
   
                }
                if (left > right) {
                    System.out.println("Element not found");
                    System.out.println("Number of steps "+steps);

            }
        }
    }
}
