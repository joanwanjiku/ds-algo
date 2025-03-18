public class TransposeMatrix {
    /*
     * Given matrix = {
            {1,2},
            {3,4},
            {5,6}
            }, output should be matrix = {
            {1,2, 3},
            {4,5,6}
            }
     */
    public static void main(String[] args) {
        // O(N*M)TS
        int[][] matrix = {
            {1,2},
            {3,4},
            {5,6}
            };
        System.out.println(matrix[0].length);
        transposeMatrix(matrix);
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;
        int[][] finalArray = new int[width][height];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                  finalArray[j][i]=  matrix[i][j];
            }
        }
        return finalArray;

      }
    
}
