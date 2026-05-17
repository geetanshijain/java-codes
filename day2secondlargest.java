public class day2secondlargest {
  
    public static void main(String[] args) {
        int a=20,b=10,c=30;
        if((a>b&&a<c)||(a<b&&a>c)){
            System.out.println("A is second largest");
        }
        else if((b>a&&b<c)||(b<a&&b>c)){
            System.out.println("B is second largest");
        }
        else{
            System.out.println("c is second largest");
        }

    }
}