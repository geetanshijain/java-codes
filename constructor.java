class Student {
    int a;
    String name;

    
    Student(int a, String name) {
        this.a = a;
        this.name = name;
    }

    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Mehak");
        s1.display();
    }
}