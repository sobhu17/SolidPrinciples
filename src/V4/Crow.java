package V4;


public class Crow extends Bird implements Flyable {

    EatingBehavior eb = new CrowOwlEatingBehavior();


    public  void eat(){
        eb.makeEat();
    }
    public  void fly(){
        System.out.println("Crow Flies!!!");
    }
}
