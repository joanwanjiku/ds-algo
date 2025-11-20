public class monotonic {
    public static void main(String[] args) {
        int[] arr = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102};
        boolean ans = isMonotonic(arr);
    }
    public static boolean isMonotonic(int[] array){
        // O(n)T and O(1)S
        if (array.length <= 1) return true; 
        boolean isDecreasing = array[0] > array[array.length -1];
        for (int i = 1; i < array.length; i++ ) {
            if (isDecreasing && array[i] >array[i - 1]) return false;
            if (!isDecreasing && array[i] < array[i -1]) return false;
        }
        return true;
    }
}
