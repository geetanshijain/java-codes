
abstract class Animal {

    
    abstract void sound();

   
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}


class Dog extends Animal {

    // Providing body to abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}


public class abstraction3{
    public static void main(String[] args) {

       
        Dog d1 = new Dog();

        d1.sound();
        d1.sleep();
    }
}