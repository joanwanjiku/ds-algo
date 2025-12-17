import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {
    /*
    you are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right, you can only
    see the k numbers in the window. each time the sliding window moves right by one position.

    Return the max sliding window

    input: [1,3,-1, -3, 5, 3, 6, 7] k= 3
    output: [3,3,5,5,6,7]
     */
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(checkMax(arr, 3)));
    }

    private static int[] checkMax(int[] arr, int k) {
        if (arr.length == 0 || arr == null || k <= 0) {
            return new int[0];
        }
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // Remove indices whose corresponding values are less than nums[i]
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offer(i);

            // Add the maximum element of the current window to the result
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peek()];
            }
        }
        return result;
    }
}
