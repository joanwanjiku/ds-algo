import java.util.*;

public class firstMissingPositive {
    /*
    Given an unsorted interger array nums, return the smallest missing integer. in O(n) time and O(1) space

    input: nums=[3,4,-1,1]
    output: 2
    */
    public static void main(String[] args) {
        System.out.println(findmissingPositive(new int[] {3,4,-1,1}));
    }
    public static int findmissingPositive(int[] arr) {
        int contains = 0, n = arr.length;

        for(int i =0; i < arr.length; i++) {
            if (arr[i] == 1) {
                contains++;
                break;
            }
        }
        if (contains == 0){
            return 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a = Math.abs(arr[i]);

            if (a==n) {
                arr[0] = -Math.abs(arr[0]);
            }else{
                arr[a] = -Math.abs(arr[a]);
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > 0) {
                return i;
            }
        }

        if (arr[0] > 0) {
            return n;
        }

        return n+ 1;
    }

}
