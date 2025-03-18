import java.util.Arrays;

public class SortedSquaredArray {
    /*
     * Given an array of intergers in ascending order, return an new array of squared elements in ascending order
     */
    public int[] sortedSquaredArray(int[] array) {
    // O(nlogn)
        int[] finalArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            finalArray[i] = array[i] * array[i];
        }
        Arrays.sort(finalArray);
        return finalArray;
    }
    public int[] sortedSquaredArray2(int[] array) {
        // O(n)
        int[] finalArray = new int[array.length];
        int startIdx = 0;
        int lastIdx = array.length - 1;
        for(int i = 0; i < array.length; i++){
            if (Math.abs(array[startIdx]) > Math.abs(array[lastIdx])) {
                finalArray[(array.length-1) - i] = array[startIdx] * array[startIdx];
                startIdx++;
            }else {
                finalArray[(array.length-1) - i] = array[lastIdx] * array[lastIdx];
                lastIdx--;
            }

        }
        return finalArray;
    }

}
