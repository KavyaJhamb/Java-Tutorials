import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float radius = scanner.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.printf("The area of the circle:%.2f%n", area);
        scanner.close();
    }
}

