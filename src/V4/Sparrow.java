package V4;;

public class Sparrow extends Bird implements Flyable {

    EatingBehavior eb = new PegionPenguinSparrowEatingBehavior();

    public  void eat(){
        eb.makeEat();
    }
    public  void fly(){
        System.out.println("Sparrow Flies!!!");
    }

}
