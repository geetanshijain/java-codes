abstract class Vehicle {
 abstract void start();
    void start1() {
        System.out.println("Vehicle needs fuel");
    }
}
class Car extends Vehicle {
 void start() {
System.out.println("Car starts with key");
    }
}
class Truck extends Vehicle {
void start() {
System.out.println("Truck starts with self");
    }
}
class Scooty extends Vehicle {
void start() {
System.out.println("Scooty starts with kick");
    }
}
public class abstraction {
public static void main(String[] args) {
Vehicle v1 = new Car();
v1.start();
    }
} 