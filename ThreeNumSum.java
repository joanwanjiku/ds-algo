import java.util.*;

public class ThreeNumSum {
  /* 
    Given a non-empty array of distinct integers, and an integer representing the sum. write a function that finds any three numbers in the array that sum up to the target sum.
    The function returns an array of the inputs in any order, if no sum is found, return an empty array.

  */
  public static void main(String[] args) {
    int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
    int targetSum = 0;
    ArrayList<Integer[]> result = threeNumSum(array, targetSum);
    System.out.println(result);
  }
  public static ArrayList<Integer[]> threeNumSum(int[] array, int targetSum) {
    Arrays.sort(array);
    ArrayList<Integer[]> result = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      int left = i + 1;
      int right = array.length - 1;
      while (left < right) {
        if (array[i] + array[left] + array[right] > targetSum) {
          right--;
        } else if (array[i] + array[left] + array[right]< targetSum) {
          left++;
        } else {
          Integer[] triplet = new Integer[] {array[i], array[left], array[right]};
          result.add(triplet);
          left++;
          right--;
        }
      }
    }
    return result;
  }
}
