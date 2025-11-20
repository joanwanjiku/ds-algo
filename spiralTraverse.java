import java.util.ArrayList;
import java.util.List;

public class spiralTraverse {

    public static void main(String[] args) {
        
    }

    public static List<Integer> traverse(int[][] array) {
         List<Integer> result = new ArrayList<>();

        if (array == null || array.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;

        while (top <= bottom && left <= right) {
            // Step 1: Traverse from Left → Right along the top row
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            // Step 2: Traverse from Top → Bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            // Step 3: Traverse from Right → Left along the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;
            }

            // Step 4: Traverse from Bottom → Top along the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }

        return result; 
  }
    

    public static List<Integer> spiralRecursive(int[][] array) {
        List<Integer> result = new ArrayList<>();
        spiralFill(array, 0, array.length - 1, 0, array[0].length -1, result);
        return result;
    }

    private static List<Integer> spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol, List<Integer> result) {
        if (startRow > endRow || startCol > endCol ) {
            
        }

        return null;
        
    }
    
}
