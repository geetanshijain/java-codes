public class errorhandling {
    public static void main (String[]args){
int a=10;
int b=0;
try{int result=a/b;}
catch(ArithmeticException e)
{
    System.out.println("invalid operation");
//System.out.println("end of program");
}
finally{
    System.out.println("you must have to enter value > 0");
}
    }}