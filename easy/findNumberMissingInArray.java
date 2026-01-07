package easy;

import java.util.ArrayList;
import java.util.List;

public class findNumberMissingInArray {
        /*
    Given an array nums of n integers where nums[i] is in the range [1, n], 
    return an array of all the integers in the range [1, n] that do not appear in nums. 
    Example:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]
    */
   public static void main(String[] args) {
    findNumberMissingInArray obj = new findNumberMissingInArray();
    int[] nums = {4,3,2,7,8,2,3,1};
    List<Integer> result = obj.findDisappearedNumbers(nums);
    for (int res: result) {
        System.out.print(res + " ");
    }
   }

    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                missing.add(i + 1);
            }
        }

        return missing; 
    }
    
}
