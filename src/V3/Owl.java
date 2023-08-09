package V3;

public class Owl extends Bird implements Eater, Flyable{
    public  void eat(){
        System.out.println("Owl eats food!!");
    }

    public  void fly(){
        System.out.println("Owl Flies!!!");
    }
}
