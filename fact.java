import java.util.Scanner;
public class fact {
    static int factorial (int n){
    if (n==1||n==0)
        return 1;
    else 
        return n*factorial(n-1); 
}
public static void main(String[] args){
    try(Scanner sc= new Scanner(System.in)){
    System.out.print("enter number");
    int num= sc.nextInt();
    int result= factorial (num);
    System.out.println("fact :-"+ result);


}
}
}
