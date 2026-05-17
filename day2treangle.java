public class day2treangle {
 
    public static void main(String[] args) {
        int a=10,b=5,c=20;
        if(a+b>c&& b+c>a &&a+c>b){
            System.err.println(" valid");

        }
        else{
            System.out.println("not valid");
        }
    }
}