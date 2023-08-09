package V4;


public class Pegion extends Bird implements Flyable {

    EatingBehavior eb = new PegionPenguinSparrowEatingBehavior();

    public  void eat(){
        eb.makeEat();
    }
    public  void fly(){
        System.out.println("Pegion Flies!!!");
    }
}
