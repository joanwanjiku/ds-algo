import java.util.*;


public class alienProblem {
    /*
    In an alien language, suppose they use English lowercase letters, but possibly in a different order, the order of the alphabetis some permutation of lowercase
    letters. 
    Given a sequence of words written in the alien language and the order of the alphabet, return true iff the given words are sorted lexicography in this alien
    language

    example
    input: Words =["hello", "leetcode"], order= "hlabcdefgijkmnopqrstuvwxyz"
    Output: true

    input: Words = ["word", "world", "row"] order="worldabcefghijkmnpqstuvxyz"
    Output: false
    */
   public static void main(String[] args) {
    System.out.println(alienCheck(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
   }

   public static boolean alienCheck(String[] words, String order) {
    Map<Character, Integer> orderMap = new HashMap<>();

    for (int i =0; i < order.length(); i++) {
        orderMap.put(order.charAt(i), i);
    }
    for (int i = 0; i < words.length - 1; i++) {
        for (int j = 0; j < words[i].length(); j++) {
            if (j >= words[i+1].length()) {
                return false;
            }
            if (words[i].charAt(j) != words[i+1].charAt(j)) {
                int currLetter = orderMap.get(words[i].charAt(j));
                int nextLetter = orderMap.get(words[i+1].charAt(j));

                if (nextLetter < currLetter) {
                    return false;
                } else {
                    break;
                }
            }
        }
    }
    return true;

   }
}
