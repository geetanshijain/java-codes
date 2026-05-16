import java.util.Scanner;
public class incestometer {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.err.print("enter number in  inches");
            double inches=sc.nextDouble();

           double meters = inches*0.0254;

         
         System.err.println("meter :" + meters);
    }
}
}