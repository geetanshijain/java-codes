import java.util.Scanner;

public class calculatorifelse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
                }

            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: " + result);
                }

            case '*' -> {
                result = num1 * num2;
                System.out.println("Result: " + result);
                }

            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                }

            default -> System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
}
