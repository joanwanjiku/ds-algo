import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    static Map<String, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        // subtractive pairs as String keys
        romanMap.put("IV", 4);
        romanMap.put("IX", 9);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));// 1994
    }
    public static int romanToInt(String s) {
        int i=0, n = s.length(), result = 0;

        while (i < n ) {
            // try two-char pair first
            if (i + 1 < n){
                String pair = s.substring(i, i+2);
                Integer val = romanMap.get(pair);
                if (val != null) {
                    result += val;
                    i += 2;
                    continue;
                }
            }
            String single = s.substring(i, i + 1);
            result += romanMap.get(single);
            i++;
        }
        return result;
    }

}