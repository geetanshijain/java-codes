import java.util.Scanner;
public class arraymulti {
    public static void main(String[] args) {
        try( Scanner sc= new Scanner(System.in)) {

 System.out.print("enter number of rows");
 int m=sc.nextInt();
System.out.print("enter number of columns");
 int n=sc.nextInt();
 int arr[][]=new int[m][n];
 System.out.println("enter the elements");
 for( int i=0;i<m;i++){
    for( int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
 }
 System.out.println("matrix");
 for( int i=0;i<m;i++){
    for( int j=0;j<n;j++){
        System.out.println(arr[i][j] + " ");
 }
 System.out.println();
      }     }
    }
}