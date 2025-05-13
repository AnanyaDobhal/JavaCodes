import java.util.*;

class NumberException extends RuntimeException {
}

class MyCalculator {
    void method(int n, int p) {
        double result = Math.pow(n, p);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.print("Enter the value of p: ");
        p = sc.nextInt();
        try {
            if (n < 0 || p < 0) {
                throw new NumberException();
            }
            if (n == 0 || p == 0) {
                throw new NumberException();
            }
            MyCalculator calc = new MyCalculator();
            calc.method(n, p);
        } catch (NumberException e) {
            if (n < 0 || p < 0) {
                System.out.println("Error: Number can't be negative.");
            } else {
                System.out.println("Error: Number can't be ZERO.");
            }
        }
    }
}
