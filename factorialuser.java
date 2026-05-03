import java.util.Scanner;
public class factorialuser {
    public static void main (String[] args) {
        int factorial=1;
     try (Scanner sc  = new Scanner(System.in)) {
     System.out.println("enter a number ");


        int n = sc.nextInt();
       for (int i=1;i<=n;i++) {
factorial= factorial* i;

}
 System.out.println(factorial);

}
}
}



























// public class factorial {
//     public static void main (String[] args) {
//         int n=5, Factorial=1;
//         for (int i=1;i<=n;i++) {
// Factorial= Factorial* i;

//         }
//         System.out.println(Factorial);


//     }
// // }