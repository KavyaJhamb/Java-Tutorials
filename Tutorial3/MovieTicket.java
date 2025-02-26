import java.util.Scanner;
class MovieTicket {
     String customerName;
     int numTickets;

    public MovieTicket(String customerName, int numTickets) {
        this.customerName = customerName;
        this.numTickets = numTickets;
    }

    public void showBooking() {
        System.out.println("Customer Name: " + customerName + ", Number of Tickets: " + numTickets);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the no: ");
        int no = scanner.nextInt();
        MovieTicket ticket1 = new MovieTicket(name, no);
        
        ticket1.showBooking();
        
    }
}
