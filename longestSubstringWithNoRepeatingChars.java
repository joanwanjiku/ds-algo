import java.util.HashSet;

public class longestSubstringWithNoRepeatingChars {
    /*
    Given string s, find the length of the longest substring without repeating characters

    Input s= "abcabcabb"
    Output 3
    */

    public static void main(String[] args) {
        String s = "abcabcabb";
        System.out.println(checkSubstring(s));
    }

    private static int checkSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right -left + 1);
            right++;
        }
        return ans;

    }
}
