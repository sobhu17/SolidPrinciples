package V3;

public class Sparrow extends Bird implements Eater, Flyable {

    public  void eat(){
        System.out.println("Sparrow eats food!!");
    }

    public  void fly(){
        System.out.println("Sparrow Flies!!!");
    }

}
