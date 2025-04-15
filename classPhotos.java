import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classPhotos {
    /* Given two arrays of heights, redShirtHeights and blueShirtHeights,
     * return true if the class photo can be taken a photo with the red shirts in the back row
     * and the blue shirts in the front row, or vice versa.
     * 
     * The heights of the students are represented by integers in the arrays.
     * 
     * Example:
     * redShirtHeights = [5, 6, 7]
     * blueShirtHeights = [3, 4, 5]
     * 
     * The function should return true because we can arrange them as follows:
     * Red: 6, 7
     * Blue: 3, 4
     */
    public static void main(String[] args) {
        // O(nlogn)T, O(1)S.
        classPhotos cp = new classPhotos();
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(3, 4, 5));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(5, 6, 7));
        
        
        System.out.println(cp.classPhotos(redShirtHeights, blueShirtHeights)); // should return true
    }
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort(null);
        blueShirtHeights.sort(null);
        int diff = redShirtHeights.get(0) - blueShirtHeights.get(0);
        for (int i = 0; i < redShirtHeights.size(); i++){
            if ((redShirtHeights.get(i) - blueShirtHeights.get(i)) * diff <=0){
              return false;
            }    
        }

        return true;
  }
}
