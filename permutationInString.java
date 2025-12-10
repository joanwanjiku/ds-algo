public class permutationInString {
    /*
    Given 2 strings s1 and s2 return tru if s2 contains permutation of s1 or false otherwise.

    In other words, return true if one of s1's permutation is the substring of s2

    Input: s1 = "ba", s2="fsdbaue"
    Output: true
    ---> sliding window technique
    */
   public static void main(String[] args) {
        String s1 = "ba";
        String s2 = "fdhdaboe";
        System.out.println(checkInclusion(s1, s2));
   }

   private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())  return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        // initialize frequency map for s1 and the first window of s2
        for (int i=0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        // slide window through s2 and compare the maps
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Map, s2Map)) {
                return true;
            }
            s2Map[s2.charAt(i + s1.length()) - 'a']++; // add a new character to the window
            s2Map[s2.charAt(i) - 'a']--; // remove old character from the window
        }
        // check the last window
        return matches(s1Map, s2Map);

   }

   private static boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
   }
}
