public class day3multipleof3 {
    public static void main(String[] args) {
        int multiply = 1;
        for(int i=1;i<=30;i++){
            if(i%3==0){
                multiply*=i;
                System.err.println(i);
            }
        }
    }
}
