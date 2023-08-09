package V1;

public class Bird {
    private String type;
    private int numLegs;
    private String color;
    private int weight;

    Bird(String type , int numLegs , String color , int weight){
        this.type = type;
        this.numLegs = numLegs;
        this.color = color;
        this.weight = weight;
    }

    public void fly(){
        System.out.println(this.type + " can fly!!!");
        // every bird has their own way of flying so we have to use
        // multiple if-else conditions in order to show fly behavior
        // which violates the First solid principle that is Single responsibility principle
        // which says that our code unit should have exactly one well defined responsibility
    }

    public void walk(){
        System.out.println(this.type + " can walk!!!");
    }

    public void eat(){
        System.out.println(this.type + " can eat!!!");
    }

    /*
    how SRP violates
            1) if we have multiple if-else in our code then it violates SRP but not always
                If if-else are dealing with some business logic then they are good to go
                but if we are using them for choosing one type then it might leads to violate SRP
            2) Monster Methods are also one of the reason for SRP violation i.e if a methos is doing much more than
                what it's name suggest it to do then it will be considered as Monster method.
            3) If we have packages/classes like Util/Helper/Commons then that also leads to SRP violation
                end up being a junkyard for anything that didn't make sense anywhere else.
     */

    // It also violates the Open Close principle of SOLID
    /*
            According to Open Close principle out code base should be open for extension
            but close for modification

            Which means new features can be added easily with no or small modifications in existing class
            but if we are making huge changes to existing class then that leads to Open Close Principle violation.

            To avoid this we have to create new classes or new methods for something that is coming new to our code.
     */
}
