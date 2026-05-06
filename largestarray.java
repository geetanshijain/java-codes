import java.util.Scanner;
public class largestarray {
    public static void main(String[] args) {
try(Scanner sc=new Scanner (System.in)){
System.out.println("enter size of array");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
    int largest=0;
  
for(int i=0;i<n;i++){
    if(arr[i]>largest){
        
        largest=arr[i];

    }




}      
System.out.println(largest);  
    }
}
}
