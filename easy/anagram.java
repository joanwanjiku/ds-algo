package easy;
public class anagram {
    /* 
    Given two string s, t return true if is an anagram else false
    e,g s=cat, t=tac ans= true
    e.g s=sam, t=sat ans false 
    */

    public static void main(String[] args) {
       String s = "cat";
       String t = "tar";
       
       System.out.println(checkAnagram(s, t));
    }

    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[26];

        for (int i =0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        for (int count: charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
