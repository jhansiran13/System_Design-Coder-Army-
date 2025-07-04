// LSP Violation Example

// Superclass
class Vehicle {
    private String name;
    private int numberOfWheels;

    public Vehicle(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // Problematic method: Assumes all vehicles have an engine
    public void startEngine() {
        System.out.println(name + " engine started.");
    }
}

// Subclass conforming to the LSP (for this specific method)
class Car extends Vehicle {
    public Car(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Car " + getName() + " engine started. Vroom!");
    }
}

// Subclass violating the LSP
class Bicycle extends Vehicle {
    public Bicycle(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    @Override
    public void startEngine() {
        // LSP Violation: Bicycles don't have engines, so this method is irrelevant or throws an error.
        throw new UnsupportedOperationException("Bicycles do not have an engine to start!");
    }
}

// Main class to demonstrate the violation
public class LspViolationDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Sedan", 4);
        Vehicle myBicycle = new Bicycle("Mountain Bike", 2);

        myCar.startEngine(); // Works as expected

        try {
            myBicycle.startEngine(); // Throws UnsupportedOperationException, violating LSP
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(myCar.getName() + " has " + myCar.getNumberOfWheels() + " wheels.");
        System.out.println(myBicycle.getName() + " has " + myBicycle.getNumberOfWheels() + " wheels.");
    }
}