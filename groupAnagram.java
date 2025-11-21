import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    /*
    Given an array of strings strs, group the anagrams together. Return  the answer in any order
    eg. strs = ["eat", "tea", "tan", "ate", "nat", "bat"] 
    ans = [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
    */

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnas(strs));
    }

    public static List<List<String>> groupAnas(String[] strings) {
        if (strings.length == 0 ) return new ArrayList<>();

        Map<String, List> ansMap = new HashMap<>();

        int[] count = new int[26];

        for (String s: strings) {
            Arrays.fill(count, 0);
            for (char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for(int i=0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            System.out.println(sb);

            String key = sb.toString();
            System.out.println("Key:-------------" +key);

            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }
            ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }
}
