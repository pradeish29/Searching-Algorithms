import java.util.Scanner;

public class BinarySearchFn {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();

            int result = binarySearch(numbers, target,0,numbers.length-1);

            if (result != -1) 
                System.out.println("Target found at index " + result);
            else 
                System.out.println("Element not found");
        }
        
    }

    static int binarySearch(int[] arr, int target,int left,int right) {
       
        if (left <= right) {
            int mid = (left + right) / 2;
        
            if (target == arr[mid]) {
                return mid; // Target found, return the index
            } 
            else if (target < arr[mid]) {
                // right = mid - 1;
                 return binarySearch(arr,target,left,mid-1);
            }
             else {
                // left = mid + 1;
                 return binarySearch(arr,target,mid+1,right);
           
            }
        }

        return -1; // Target not found
    }
}
