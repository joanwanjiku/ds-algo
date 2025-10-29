import java.util.Arrays;

public class smallestDifference {
    /*
    Given two non-empty arrays of integers, write a function that finds the pair of numbers (one from each array) whose absolute difference is closest to zero.
    The function should return an array containing these two numbers, with the number from the first array in the first position.
    Assume that there will only be one pair of numbers with the smallest difference.
    */
    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] result = smallestDifference(arrayOne, arrayTwo);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // T(n log n + m log m) time | O(1) space, n is length of arrayOne, m is length of arrayTwo
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int indexOne = 0;
        int indexTwo = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int firstNum = arrayOne[indexOne];
            int secondNum = arrayTwo[indexTwo];
            if (firstNum < secondNum) {
                currentDiff = secondNum - firstNum;
                indexOne++;
            } else if (secondNum < firstNum) {
                currentDiff = firstNum - secondNum;
                indexTwo++;
            }
            else {
                return new int[] {firstNum, secondNum};
            }
            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                result[0] = firstNum;
                result[1] = secondNum;
            } 
        }
        return result;
    }

}
