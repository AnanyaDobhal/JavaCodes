import java.util.Scanner;
class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        int option = sc.nextInt();
        switch (option) {
            case 1: //term deposite
                System.out.println("Enter Principal (p):");
                double principal = sc.nextDouble();
                System.out.println("Enter Rate of Interest (r) in percentage:");
                double rate = sc.nextDouble();
                System.out.println("Enter Time Period (n) in years:");
                double time = sc.nextDouble();

                double maturityTermDeposit = principal * Math.pow(1 + rate / 100, time);
                System.out.println("The maturity amount for Term Deposit is: " + maturityTermDeposit);
                break;

            case 2: // Recurring Deposit
                System.out.println("Enter Monthly Installment (p):");
                double installment = sc.nextDouble();
                System.out.println("Enter Rate of Interest(r) in percentage:");
                double interestRate = sc.nextDouble();
                System.out.println("Enter Time Period(n) in months:");
                double months = sc.nextDouble();
                double maturityRecurringDeposit = installment * months
                        + (installment * months * (months + 1) / 2) * (interestRate / 100) * (1 / 12);
                System.out.println("The maturity amount for Recurring Deposit is: " + maturityRecurringDeposit);
                break;

            default:
                System.out.println("Invalid option selected! Please choose a valid option.");
        }

        sc.close();
    }
}
