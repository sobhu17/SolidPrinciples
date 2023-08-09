package V4;

public class Owl extends Bird implements Flyable {


    EatingBehavior eb = new CrowOwlEatingBehavior();


    public  void eat(){
        eb.makeEat();
    }
    public  void fly(){
        System.out.println("Owl Flies!!!");
    }
}
