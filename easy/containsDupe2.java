package easy;
import java.util.HashSet;
import java.util.Set;

public class containsDupe2 {
    /*  
    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
     such that nums[i] == nums[j] and abs(i - j) <= k
    e.g [1,2,3,1] k=3 ans=true 
    e.g [1,2,3,1,2,3] k=2 ans false
    */

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsNearDupes(arr,3));
    }

    public static boolean containsNearDupes(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i < arr.length; i++) {
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }
}
