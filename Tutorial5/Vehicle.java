// Vehicle.java
class Vehicle {
    private double speed;
    private double fuel;

    public Vehicle(double speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void move() {
        System.out.println("Moving at " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private boolean hasAirConditioner;

    public Car(double speed, double fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    public void turnOnAC() {
        System.out.println(hasAirConditioner ? "AC is turned on" : "AC unavailable");
    }
}

// Bike.java
class Bike extends Vehicle {
    private boolean hasKickStart;

    public Bike(double speed, double fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    public void startBike() {
        System.out.println(hasKickStart ? "Starting with kick-start" : "Starting with self-start");
    }
}

// Truck.java
class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(double speed, double fuel, double cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Loading cargo. Capacity: " + cargoCapacity + " kg");
    }
}

// Main.java
 class Vehicle2 {
    public static void main(String[] args) {
        Car sedan = new Car(120, 50, true);
        sedan.move();
        sedan.turnOnAC();

        Bike sportsBike = new Bike(80, 10, false);
        sportsBike.move();
        sportsBike.startBike();

        Truck semi = new Truck(60, 200, 5000);
        semi.move();
        semi.loadCargo();
    }
}
