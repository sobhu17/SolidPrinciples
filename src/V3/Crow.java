package V3;

public class Crow extends Bird implements Eater, Flyable{
    public  void eat(){
        System.out.println("Crow eats food!!");
    }

    public  void fly(){
        System.out.println("Crow Flies!!!");
    }
}
