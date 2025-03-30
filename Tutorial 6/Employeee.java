abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double calculateSalary();
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
class Employeee{
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("John Doe", 4500);
        PartTimeEmployee pt = new PartTimeEmployee("Jane Smith", 20, 80);
        
        ft.displayDetails();
        pt.displayDetails();
    }
}
