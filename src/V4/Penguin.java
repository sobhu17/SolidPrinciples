package V4;

public class Penguin extends Bird {
    EatingBehavior eb = new PegionPenguinSparrowEatingBehavior();

    public  void eat(){
        eb.makeEat();
    }
}
