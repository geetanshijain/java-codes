class livingbeing{
    void breath(){
         System.out.println("all living organisms breath");
    }
}

class animal extends livingbeing{
    void eat(){
        System.out.println("all animals eat");
    }
}
class bird extends animal{
    void flying(){
        System.out.println("birds can fly");
    }
}
class parrot extends bird {
    void speak(){
        System.out.print("parrots can speak");
    }
}
public class livingoops {
    public static void main(String[] args) {
        
        parrot l = new parrot();
        l.breath();
           l.eat();
              l.flying();
                 l.speak();
    }
    
}
