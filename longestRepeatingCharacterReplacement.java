public class longestRepeatingCharacterReplacement {
    /*
    You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character.
    Perform this operation  at most k times
    Return the length of the longest substring containing the same letter you can get after performing the above operations

    Example
    Input: s = "ABAB", k=2
    Output: 4 , Replace the 2 A's with the two B's or vice versa

    Input: s = "PXQXYXA", k=2


    Explanation
    sliding window + 2 ptr
    len(substring while sliding the window) - max(occurring element) <= k, 

    */
   public static void main(String[] args) {
    String s = "ABAB";
    int k = 2;

    System.out.println(checkRepeating(s, k));
   }

   private static int checkRepeating(String s, int k) {
    int[] occurance = new int[26];
    int left = 0;
    int ans = 0;
    int maxOccurance = 0;

    for(int right=0; right < s.length(); right++) {
        maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);
        if (right - left + 1 - maxOccurance > k) {
            occurance[s.charAt(left) - 'A']--;
            left++;
            
        }
        ans = Math.max(ans, right-left + 1);
    }
    return ans;
   }
}
