import java.util.Scanner;

class LoanCalculator {
    // Method for Personal Loan
    public double calculateLoan(double principal, double interestRate) {
        return principal + (principal * interestRate / 100);
    }

    // Method for Home Loan
    public double calculateLoan(double principal, double interestRate, int tenure) {
        return principal + (principal * interestRate / 100 * tenure);
    }

    // Method for Car Loan
    public double calculateLoan(double principal, double interestRate, int tenure, double processingFee) {
        return principal + (principal * interestRate / 100 * tenure) + processingFee;
    }
}

public class LoanCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanCalculator calculator = new LoanCalculator();

        // Personal Loan 
        System.out.print("Enter principal amount for Personal Loan: ");
        double personalLoanPrincipal = scanner.nextDouble();
        System.out.print("Enter interest rate for Personal Loan: ");
        double personalLoanInterestRate = scanner.nextDouble();
        double personalLoanTotal = calculator.calculateLoan(personalLoanPrincipal, personalLoanInterestRate);
        System.out.println("Personal Loan Total: " + personalLoanTotal);

        // Home Loan
        System.out.print("Enter principal amount for Home Loan: ");
        double homeLoanPrincipal = scanner.nextDouble();
        System.out.print("Enter interest rate for Home Loan: ");
        double homeLoanInterestRate = scanner.nextDouble();
        System.out.print("Enter tenure (in years) for Home Loan: ");
        int homeLoanTenure = scanner.nextInt();
        double homeLoanTotal = calculator.calculateLoan(homeLoanPrincipal, homeLoanInterestRate, homeLoanTenure);
        System.out.println("Home Loan Total: " + homeLoanTotal);

        // Car Loan 
        System.out.print("Enter principal amount for Car Loan: ");
        double carLoanPrincipal = scanner.nextDouble();
        System.out.print("Enter interest rate for Car Loan: ");
        double carLoanInterestRate = scanner.nextDouble();
        System.out.print("Enter tenure (in years) for Car Loan: ");
        int carLoanTenure = scanner.nextInt();
        System.out.print("Enter processing fee for Car Loan: ");
        double carLoanProcessingFee = scanner.nextDouble();
        double carLoanTotal = calculator.calculateLoan(carLoanPrincipal, carLoanInterestRate, carLoanTenure, carLoanProcessingFee);
        System.out.println("Car Loan Total: " + carLoanTotal);
        scanner.close();
    }
}