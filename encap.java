class locker{
    private String pin= "1234";
    private boolean isopen= false;
    public void openlocker(String enterpin){
if(enterpin == pin) {
    isopen= true;
    System.out.println("locker opened");
}
else{
    System.err.println("wrong pin");
}
    }

public void checkStatus () {
if(isopen)
{
System.err.println("locker open");
}
else{
    System.out.println("locker is closed");
}
}}

public class encap {
    public static void main(String[] args) {
        locker a= new locker();
        a.checkStatus();
        a.openlocker("1111");
        a.openlocker("1234");
        a.checkStatus();
    }
}

                                                                                                                                                               
                      