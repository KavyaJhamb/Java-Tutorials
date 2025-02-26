import java.io.*;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final String FILE_NAME = "students.txt";

    public static void saveStudentDetails(String name, int age) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + age);
            writer.newLine();
            System.out.println("Student details saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void retrieveStudentDetails() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Student Details:");
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                System.out.println("Name: " + details[0] + ", Age: " + details[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        saveStudentDetails(name, age);
        retrieveStudentDetails();
    }
}
