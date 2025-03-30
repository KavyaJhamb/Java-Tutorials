import java.util.Scanner;

public class LicenseSystem {
    public static void checkEligibility(int age) throws IllegalArgumentException {
        if(age < 18) {
            throw new IllegalArgumentException("Applicant is underage");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter applicant age: ");
            int age = scanner.nextInt();
            
            checkEligibility(age);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Invalid input: Please enter numeric age");
        }
        finally {
            scanner.close();
            System.out.println("Registration process completed");
        }
    }
}
