import java.util.Scanner;

public class calculatorbyfunction {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            int result = 0; // FIXED

            switch (choice) {
                case 1 -> {
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                }

                case 2 -> {
                    result = sub(num1, num2);
                    System.out.println("Result = " + result);
                }

                case 3 -> {
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                }

                case 4 -> {
                    if (num2 != 0) {
                        result = divide(num1, num2);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                }

                case 5 -> {
                    if (num2 != 0) {
                        result = modulus(num1, num2);
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot perform modulus by zero!");
                    }
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
