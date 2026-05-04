import java.util.Scanner;
public class countfrequency {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner (System.in)){
            
    
        System.out.print("Enter number  ");
            int num=sc.nextInt();
            System.out.println("enter digit to find");
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
           

    }
}
}   