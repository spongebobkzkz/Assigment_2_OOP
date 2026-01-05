import java.util.*;

// Task 1
abstract class Car {
    String model;
    String manufacturer;
    int year;
    double price;

    Car(String m, String man, int y, double p) {
        model = m;
        manufacturer = man;
        year = y;
        price = p;
    }

    abstract void print();
}

// Task 2
abstract class Vehicle {
    String model;
    String manufacturer;
    int year;

    Vehicle(String m, String man, int y) {
        model = m;
        manufacturer = man;
        year = y;
    }

    abstract void print();
}

class Sedan extends Vehicle {
    Sedan(String m, String man, int y, double p, int d) {
        super(m, man, y);
    }

    void print() {
        System.out.println("Sedan: " + model);
    }
}

class Bus extends Vehicle {
    Bus(String m, String man, int y, int s) {
        super(m, man, y);
    }

    void print() {
        System.out.println("Bus: " + model);
    }
}

// Task 3
class VehicleList {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void add(Vehicle v) {
        vehicles.add(v);
    }

    void show() {
        for (Vehicle v : vehicles) {
            v.print();
        }
    }
}

// Task 4
class Assignment2 {
    public static void main(String[] args) {
        Vehicle s = new Sedan("Camry", "Toyota", 2020, 25000, 4);
        Vehicle b = new Bus("CityBus", "Mercedes", 2019, 50);

        VehicleList sys = new VehicleList();
        sys.add(s);
        sys.add(b);
        sys.show();
    }
}
