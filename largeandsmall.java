import java.util.Scanner;

public class largeandsmall {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.err.print("enter number a");
            int a=sc.nextInt();
             System.err.print("enter number b");
            int b=sc.nextInt();
            System.err.print("enter number c");
            int c=sc.nextInt();
            int largest,smallest;
            if (a>=b&&a<=c)
                largest=a;
            else if(b>=a&& b>=c)
                largest =b;
           else
             largest =c;
            if (a<=b && a<=c)
               smallest =a;
            else if( b<=a && b<=c)
                smallest=b;
            else 
               smallest =c;
            System.err.println("largest:"+ largest);
            System.err.println("smallest:"+smallest);



        }

    }
    
}