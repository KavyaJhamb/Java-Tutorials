import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final double BALANCE = 5000;
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            
            if(amount <= 0) {
                throw new IllegalArgumentException();
            }
            if(amount > BALANCE) {
                throw new ArithmeticException();
            }
            
            System.out.println("Withdrawal successful. New balance: $" + (BALANCE - amount));
        } 
        catch(InputMismatchException e) {
            System.out.println("Error: Non-numeric input detected");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error: Amount must be positive");
        }
        catch(ArithmeticException e) {
            System.out.println("Error: Insufficient funds");
        }
        finally {
            System.out.println("Transaction processing completed");
            scanner.close();
        }
    }
}

