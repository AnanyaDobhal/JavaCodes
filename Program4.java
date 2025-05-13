import java.util.Scanner;
class Program4 {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer:");
        int number = sc.nextInt();

        int modifiedNumber = 0;
        int placeValue = 1;  
        while (number > 0) {
            int digit = number % 10;  
            if (digit == 0) {
                digit = 1;  
            }
            modifiedNumber = digit * placeValue + modifiedNumber;

            number = number / 10;
            placeValue *= 10;  
        }

        System.out.println("Modified number: " + modifiedNumber);

    sc.close();
    }
}

