import java.util.Scanner;

enum TrafficSignal {
    RED, YELLOW, GREEN
}

class TrafficSignalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a traffic signal (RED, YELLOW, GREEN): ");
        String input = scanner.next().toUpperCase();

        try {
            TrafficSignal signal = TrafficSignal.valueOf(input);
            switch (signal) {
                case RED:
                    System.out.println("Action: Stop");
                    break;
                case YELLOW:
                    System.out.println("Action: Slow Down");
                    break;
                case GREEN:
                    System.out.println("Action: Go");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid signal!");
        }

        scanner.close();
    }
}
