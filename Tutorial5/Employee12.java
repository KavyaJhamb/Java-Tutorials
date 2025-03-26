// Employee.java
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Manager.java
class Manager extends Employee {
    private double incentive;

    public Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Incentive: $" + incentive);
    }
}

// Developer.java
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// EmployeeMain.java
 class Employee12 {
    public static void main(String[] args) {
        Manager projectLead = new Manager("Anika Patel", 85000, 12500);
        projectLead.displayDetails();
        
        System.out.println();  
        
        Developer backendDev = new Developer("Rohan Sharma", 65000, "Python");
        backendDev.displayDetails();
    }
}
