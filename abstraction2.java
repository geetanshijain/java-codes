abstract class Car {
    abstract void start();
     abstract void stop();
    void start1() {
        System.out.println("car started");
    }
   
    void stop1() {
        System.out.println("car stopped");
}}
class Bike extends Car{
 void start() {
System.out.println("cike starts");
    }
    
    void stop() {
        System.out.println("bike stopped");
}}
class bus extends Car {
void start() {
System.out.println("bus starts");
    }
    
    void stop() {
        System.out.println("bus stopped");
}
}
public class abstraction2 {
public static void main(String[] args) {
Car v1 = new Bike();
v1.start();
v1.stop();

    }
}