
"""
    Given a non-empty array of distinct integers, and an integer representing the sum. write a function that finds any tow numbers in the array that sum up to the target sum.
    The function returns an array of the inputs in any order, if no sum is found, return an empty array.
"""
import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // does in O(nlogn) complexity
    Arrays.sort(array);
    int left = 0;
    int right = array.length -1;
    int currSum = 0;
    while (left < right){
       currSum = array[left] + array[right];
      if (currSum == targetSum){
        return new int[]{array[left], array[right]};
      } else if (currSum < targetSum){
        left += 1;
      } else {
        right -= 1;
      }
    }
    return new int[0];

  }

  public static int[] twoNumberSum2(int[] array, int targetSum) {
    // O(n) complexity
    Set<Integer> numSet = new HashSet<>();
    for(int num:array){
      if (numSet.contains(targetSum - num)) {
        return new int[]{num, targetSum-num};
      } else {
        numSet.add(num);
      }
    }
    return new int[0];
  }
}
