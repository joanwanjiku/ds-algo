package hard;
import java.util.HashMap;
import java.util.Map;

public class minimumWindowSubString {
   /*
   Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character 
   in t (including duplicates) is included in the window. If there is no such substring, return the empty string

   Input: s = "ADOBECODEBANC", t="ABC"
   Output: "BANC"
   Explanation: The minimum window substring "BANC" includes "A", "B", "C" from string t.

   */ 
  public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    System.out.println(checkMinWindowSubstring(s, t));

  }

  private static String checkMinWindowSubstring(String s, String t) {
    if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
        return "";
    }
    Map<Character, Integer> mapT = new HashMap<>();
    for(int i = 0; i < t.length(); i++) {
        mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0)+ 1);
    }
    int required = mapT.size();
    int l= 0, r = 0;
    int create = 0;
    int[] ans = {-1, 0, 0};
    Map<Character, Integer> subStrinMap = new HashMap<>();
    while(r < s.length()) {
        char c = s.charAt(r);
        int count = subStrinMap.getOrDefault(c, 0);
        subStrinMap.put(c, count + 1);
        if (mapT.containsKey(c) && subStrinMap.get(c).intValue() == mapT.get(c).intValue()) {
            create++;
        }
        while (l <= r && required == create) {
            c = s.charAt(l);
            if (ans[0] == -1 || ans[0] >= r-l+1) {
                ans[0] = r-l + 1;
                ans[1] = l;
                ans[2] = r;
            }
            subStrinMap.put(c, subStrinMap.get(c) -1);
            if (mapT.containsKey(c) && subStrinMap.get(c).intValue() < mapT.get(c).intValue() ) {
                create--;
            }
            l++;
        }
        r++;
    }
    if (ans[0] == -1) {
        return "";
    }
    return  s.substring(ans[1], ans[2] + 1);
  }
}
