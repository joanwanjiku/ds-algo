import java.util.Arrays;

public class minimumWaitingTime {
    /* Given this array, should return the minimum waiting time
     * = 12 == (0 + 3 + 5 + 7 + 8)
     * [3, 5, 7, 8]
     */
    public int minimumWaitingTime(int[] queries) {
        
        // O(nlogn)T, O(1)S.
        int totalWaitTime = 0;
        int currWaitTime = 0;
        Arrays.sort(queries);
        for (int i = 0; i < queries.length - 1; i++) {
            currWaitTime += queries[i];
            totalWaitTime += currWaitTime;
        }
        return totalWaitTime;
    }
    
}
