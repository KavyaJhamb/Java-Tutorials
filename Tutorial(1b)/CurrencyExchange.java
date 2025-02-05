import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double amountInUSD = scanner.nextDouble();

        double exchangeRate = 86.5;

        double amountInINR = amountInUSD * exchangeRate;

        System.out.printf("Converted amount in INR (double): %.2f%n", amountInINR);

        int roundedAmountInINR = (int) amountInINR;
        System.out.printf("Converted amount in INR (int): %d%n", roundedAmountInINR);

        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;
        System.out.printf("Widening Conversion: byte -> int -> double: %d -> %d -> %.2f%n", byteValue, intValue, doubleValue);

        double anotherDoubleValue = 123.45;
        int anotherIntValue = (int) anotherDoubleValue;
        byte anotherByteValue = (byte) anotherIntValue;
        System.out.printf("Narrowing Conversion: double -> int -> byte: %.2f -> %d -> %d%n", anotherDoubleValue, anotherIntValue, anotherByteValue);
    scanner.close();
    }
}