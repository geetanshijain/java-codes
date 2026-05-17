import java.util.Scanner;
public class sumcount{
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.err.println("enter a");
        int a=sc.nextInt();
        int sum=0;
        int sub=0;
        int  total =0;
        for(int i=0;i<=a;i++){
            if(i%2==0){
        sub-=i;}
        else {
            sum+=i;
        }
        total=sum+sub;

        }
        System.out.println(total);
    }
}
}
