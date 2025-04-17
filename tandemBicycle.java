import java.util.Arrays;

public class tandemBicycle {
    /* Given two arrays of integers, redShirtSpeeds and blueShirtSpeeds,
     * return the maximum total speed of the tandem bicycle.
     * 
     * The function should take a boolean parameter fastest, which indicates whether
     * to maximize the speed or minimize it.
     * 
     * Example:
     * redShirtSpeeds = [5, 3, 2, 1]
     * blueShirtSpeeds = [6, 4, 3, 2]
     * fastest = true
     * 
     * The function should return 20 because the maximum total speed is achieved
     * by pairing the fastest riders together.
     */
    public static void main(String[] args) {
        tandemBicycle tb = new tandemBicycle();
        int[] redShirtSpeeds = {5, 3, 2, 1};
        int[] blueShirtSpeeds = {6, 4, 3, 2};
        boolean fastest = true;
        System.out.println(tb.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest)); // should return 20
    }
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // O(nlogn)T, O(1)S.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int n = redShirtSpeeds.length;
        int totalSpeed = 0;
        if (fastest) {
            for (int i = 0; i < n; i++) {
                totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[n - 1 - i]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
            }
        }
        return totalSpeed;
    }
    
}
