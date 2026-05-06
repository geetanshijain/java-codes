class Locker {
    private int pin = 1234;
    private boolean isOpen = false;

    // Method to open locker
    public void openLocker(int enterPin) {
        if (enterPin == pin) {
            isOpen = true;
            System.out.println("Locker opened");
        } else {
            System.out.println("Wrong pin");
        }
    }

    // Method to check status
    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Locker A = new Locker();

        A.checkStatus();
        A.openLocker(1111);
        A.openLocker(1234);
        A.checkStatus();
    }
}