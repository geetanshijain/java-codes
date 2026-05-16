
class pen{
    String color;
    String type;
 public void write(){
    System.out.println("writes");
     System.out.println(color);
        System.out.println(type);
 }

}
public class class1 {
    public static void main(String[] args) {
        
    
    pen pen1 =new pen();
     pen1.color ="blue";
     pen1.type = "gel";
    
 pen pen2 =new pen();
     pen2.color ="blu";
     pen2.type = "ball";
     pen1.write();
     pen2.write();
}}
