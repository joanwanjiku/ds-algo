import java.util.HashSet;
import java.util.Set;

public class longestSubsequence {
    

    public static void main(String[] args) {
        System.out.println(checkLongest(new int[] {100,4,200,5,2,3}));
    }

    private static int checkLongest(int[] arr) {

        if (arr.length ==0) {
            return 0;
        }
        Set<Integer> numSet= new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            numSet.add(arr[i]);
        }
        int longestSub = 1;
        for (int num: numSet) {
            if (numSet.contains(num-1)) {
                continue; 
            } 
            else {
                int currNum = num;
                int currSub = 1;
                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currSub++;
                }
                longestSub = Math.max(longestSub, currSub);
            }
        }
        return longestSub;
    }
}

