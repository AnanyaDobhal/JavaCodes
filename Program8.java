import java.util.Scanner;
public class Program8 {
    public static void countPatterns(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                for (int j = i + 2; j < s.length(); j++) {
                    if (s.charAt(j) == '0') {
                        System.out.println("Pattern found: " + s.substring(i, j + 1));
                        count++;
                        break; 
                    }
                }
            }
        }
        System.out.println("Total count of 0(1+)0 patterns: " + count);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string containing 0's and 1's: ");
        String inputString = sc.nextLine();
        countPatterns(inputString);
        sc.close();
    }
}
