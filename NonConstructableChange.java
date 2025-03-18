import java.util.Arrays;

public class NonConstructableChange {
    /*
     * Given an array of integers [1,2,5], output should be 4
     */
    public int nonConstructibleChange(int[] coins) {
        // O(nlogn)T + O(1)S
        if (coins.length == 0) return 1;
        Arrays.sort(coins);
        int minChange = 0;
        for(int i = 0; i < coins.length; i++) {
            if(coins[i] > minChange + 1){
                break;
            }
            minChange += coins[i];
        }
        return minChange + 1;
    }
}
