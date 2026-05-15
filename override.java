class bank{
void intrest_rate(){
    System.out.println("bank intrest");
}
}
class sbi extends bank{
    void intrest_rate(){
        System.out.println("sbi intrest rate is 7%");
    }
}
class hdfc extends bank{
    void intrest_rate(){
        System.out.println("hdfc  intrest rate is 10%");
    }
}class icici extends bank{
    void intrest_rate(){
        System.out.println("icici intrest rate is 20%");
    }
}
public class override{
    public static void main(String[] args) {
        bank b;
        b=new sbi();
    b.intrest_rate();  
     b=new hdfc();
    b.intrest_rate();  
     b=new icici();
    b.intrest_rate();    
}
}