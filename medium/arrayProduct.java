package medium;
import java.util.Arrays;

public class arrayProduct {
    /*
    Given an integer array, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]
    Algorithm must runs in O(n) without using the division operator

    input = [1,2,3,4]
    output = [24, 12, 8, 6]
    */
   public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(Arrays.toString(getProduct(arr)));
   }
   public static int[] getProduct(int[] arr) {
    int[] ansArr = new int[arr.length];
    int pre = 1, post = 1;
    Arrays.fill(ansArr, 1);
    for (int i=0; i < arr.length; i++) {
        ansArr[i] = pre;
        pre = arr[i] * pre;
    }
    for (int i=arr.length -1; i >=0; i--) {
        ansArr[i] = post * ansArr[i];
        post = arr[i] * post;
    }
    return ansArr;
   }
}
