// LSP Solution Example

// Top-level interface or abstract class for general transportation
abstract class TransportationDevice {
    private String name;
    private int numberOfWheels;

    public TransportationDevice(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // Common method for all transportation devices
    public abstract void startMoving();
}

// Abstract class for devices that have engines
abstract class EnginePoweredVehicle extends TransportationDevice {
    public EnginePoweredVehicle(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    // Method specific to engine-powered vehicles
    public abstract void startEngine();
}

// Abstract class for devices that do not have engines
abstract class NonEnginePoweredVehicle extends TransportationDevice {
    public NonEnginePoweredVehicle(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }
    // No startEngine() method here, as it's not applicable
}

// Concrete class: Car
class CarLSP extends EnginePoweredVehicle {
    public CarLSP(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Car " + getName() + " engine started. Vroom!");
    }

    @Override
    public void startMoving() {
        startEngine(); // Starting engine is part of moving for a car
        System.out.println("Car " + getName() + " is moving.");
    }
}

// Concrete class: Motorcycle
class MotorcycleLSP extends EnginePoweredVehicle {
    public MotorcycleLSP(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle " + getName() + " engine started. Revving!");
    }

    @Override
    public void startMoving() {
        startEngine(); // Starting engine is part of moving for a motorcycle
        System.out.println("Motorcycle " + getName() + " is moving.");
    }
}

// Concrete class: Bicycle
class BicycleLSP extends NonEnginePoweredVehicle {
    public BicycleLSP(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    @Override
    public void startMoving() {
        System.out.println("Bicycle " + getName() + " is pedaling and moving.");
    }
    // No startEngine() method as it's not inherited
}

// Main class to demonstrate the solution
public class LspSolutionDemo {
    public static void main(String[] args) {
        TransportationDevice myCar = new CarLSP("Sedan", 4);
        TransportationDevice myMotorcycle = new MotorcycleLSP("Cruiser", 2);
        TransportationDevice myBicycle = new BicycleLSP("Road Bike", 2);

        // All can call startMoving() without issues, as it's common to all TransportationDevices
        myCar.startMoving();
        myMotorcycle.startMoving();
        myBicycle.startMoving();

        System.out.println("\n--- Engine specific operations ---");

        // We can safely cast to EnginePoweredVehicle because we know it has an engine
        if (myCar instanceof EnginePoweredVehicle) {
            ((EnginePoweredVehicle) myCar).startEngine();
        }

        if (myMotorcycle instanceof EnginePoweredVehicle) {
            ((EnginePoweredVehicle) myMotorcycle).startEngine();
        }

        // This would not compile or would cause a ClassCastException at runtime
        // if we tried to call startEngine on myBicycle after casting to EnginePoweredVehicle,
        // which demonstrates adherence to LSP:
        // if (myBicycle instanceof EnginePoweredVehicle) {
        //     ((EnginePoweredVehicle) myBicycle).startEngine(); // This line would be problematic
        // }

        System.out.println("\n" + myCar.getName() + " has " + myCar.getNumberOfWheels() + " wheels.");
        System.out.println(myMotorcycle.getName() + " has " + myMotorcycle.getNumberOfWheels() + " wheels.");
        System.out.println(myBicycle.getName() + " has " + myBicycle.getNumberOfWheels() + " wheels.");
    }
}