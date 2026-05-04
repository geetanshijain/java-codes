interface print {
    void printing();
}

interface scanner {
    void scanning();
}

interface fax{
    void forfax();
}

public class interface2 implements print,scanner,fax {

    public void printing() {
        System.out.println("Method 1 from I1 executed.");
    }

    public void scanning() {
        System.out.println("Method 2 from I2 executed.");
    }

    public void forfax() {
        System.out.println("Method 3 from I3 executed.");
    }

    public static void main(String[] args) {
        interfacecode obj = new interfacecode();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
