final class FinalClass {
    void show() {
        System.out.println("This is a final class method");
    }
}


class Parent {
    final void display() {
        System.out.println("This is a final method");
    }
}


class Child extends Parent {
   

    void show() {
        final int x = 10;
       

        System.out.println("Final variable x = " + x);
    }
}
public class main1 {
    public static void main(String[] args) {

        FinalClass obj1 = new FinalClass();
        obj1.show();


        Child obj2 = new Child();
        obj2.display(); 
        obj2.show();    
    }
}