package V3;

public class Pegion extends Bird implements Eater, Flyable{

    public  void eat(){
        System.out.println("Pegion eats food!!");
    }

    public  void fly(){
        System.out.println("Pegion Flies!!!");
    }
}
