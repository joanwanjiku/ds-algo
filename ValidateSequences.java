import java.util.*;

public class ValidateSequences {
    /*
     * Given two non-empty arrays, validate the second is a set of the first and the elements in the second are in the same order as they appear in the first.
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
        int arrIndx = 0;
        int seqIndx = 0;
        while (arrIndx < array.size() && seqIndx < sequence.size()){
            if (array.get(arrIndx).equals(sequence.get(seqIndx))){
                seqIndx++;
            }
            arrIndx++;
        }
        return seqIndx == sequence.size();
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
            int seqIndx = 0;
            for(int num : array) {
                if (seqIndx == sequence.size()) {
                    break;
                }
                if (sequence.get(seqIndx).equals(num)){
                    seqIndx++;
                }
            }
            return seqIndx == sequence.size();
        }



}
