import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}
}