import java.util.Scanner;

public class swaplab {
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.err.println("enter any number a");
        int a=sc.nextInt();
        System.err.println("enter any number b");
        int b=sc.nextInt();
 a=a+b;
 b=a-b;
 a=a-b;
 System.err.println("a=" +a );
  System.err.println("b=" +b);


    }
}
}
