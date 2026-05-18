
class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNo;
    String course;

    // Constructor
    Student(String name, int age, int rollNo, String course) {
        super(name, age); 
        this.rollNo = rollNo;
        this.course = course;
    }

    
  
    void displayInfo() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}


public class oops1 {
    public static void main(String[] args) {

       
        Student s1 = new Student("Geet", 19, 101, "BCA");

       
        s1.displayInfo();
    }
}