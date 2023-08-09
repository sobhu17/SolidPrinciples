package V2;

abstract public class Bird {
    private String type;
    private int numLegs;
    private String color;
    private int weight;

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    private boolean canFly;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract public void fly();

    public void walk(){
        System.out.println(this.type + " can walk!!!");
    }

    public void eat(){
        System.out.println(this.type + " can eat!!!");
    }


    /*
        to avoid srp and ocp violation what we can use is make out bird class abstract with fly method as abstract
        and create a separate class for each bird that comes to us.
     */
}
