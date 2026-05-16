import java.util.Scanner;
public class primitive {
   public static void main(String[] args) {
     try  (Scanner sc  = new Scanner(System.in)) {
       
      
        System.out.print("enter num");
         int num= sc.nextInt();
         System.out.print("enter decimal number");
         double price =sc.nextDouble();
         System.out.print("enter grade");
         char grade =sc.next().charAt(0);
          System.out.print("enter true or false");
         boolean status =sc.nextBoolean();
         System.out.println("integer:"+ num);
          System.out.println("decimal:"+ price);
           System.out.println("character:"+ grade);
            System.out.println("Boolean"+ status);

     }}}