import java.util.Scanner;
public class countfrequency {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner (System.in)){
        int num=sc.nextInt();
        System.out.print("Enter digit to find: ");
         int digit=sc.nextInt();
       int count = 0;
       while (num != 0) {
        int rem= num %10;
      if (rem == digit) {
                count++;
            }
            num = num / 10;      
        }

        System.out.println("Frequency = " + count);
           

        System.out.println("Frequency = " + count);
    }
}
    }