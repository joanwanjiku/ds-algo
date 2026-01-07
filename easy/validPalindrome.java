package easy;
public class validPalindrome {

    /*
    given a string, s return true is it is a palindrome
    input: "A man, a plan, a canal: Panama"
    output: true
    */
    public static void main(String[] args) {
        // O(n) T and O(1)s
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(s1));
    }

    private static boolean checkPalindrome(String s1) {
        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s1.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s1.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s1.charAt(left)) != Character.toLowerCase(s1.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
