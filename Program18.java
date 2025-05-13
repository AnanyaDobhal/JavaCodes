import java.io.*;
import java.util.*;

class PalindromeCounter {
    public static void main(String[] args) throws Exception {
        int palindromeCount = 0;
        Scanner sc = new Scanner(new File("Myfile.txt"));
        while(sc.hasNext()){
            String s = sc.next();
            if(isPalindrome(s)){
                System.out.println(s);
                palindromeCount++;
            }
        }
        System.out.println("number of palindromes present are: " + palindromeCount);
    }
    static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String w = word.toLowerCase();
        int left = 0;
        int right = w.length() - 1;
        while (left < right) {
            if (w.charAt(left) != w.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}