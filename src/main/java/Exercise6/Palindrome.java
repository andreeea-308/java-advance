package Exercise6;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(itIsAPalindrome("capac"));
        System.out.println(itIsAPalindrome("abccba"));
        System.out.println(itIsAPalindrome("palindrom"));
    }

    public static boolean itIsAPalindrome(String palindrome) {
        int i = 0, j = palindrome.length() - 1;
        while (i < j) {
            if(palindrome.charAt(i)==palindrome.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
