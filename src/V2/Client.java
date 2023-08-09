package V2;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird pegion = new Pegion();
        Bird penguin = new Pegion();

        sparrow.setCanFly(true);
        pegion.setCanFly(true);
        penguin.setCanFly(false);

        List<Bird> birds = new ArrayList<>();

        birds.add(pegion);
        birds.add(sparrow);
        birds.add(penguin);

        for(Bird b : birds){
            if(b.getCanFly() == true){
                b.fly();
            }
        }


        /*
            here we can store the objects of any specific bird to the Bird Class Variable
            but here we are violating Liskov's Substitution Principle
            which says that: the object of a child class should be AS-Is substitutable in a varibale of
            a parent class which requiring an special checks.

            Like some birds dont have fly method like penguin and we want to group all the birds that can fly
            in a LIST so we have to add a check if a bird is flying or not which violates the Liskov's principle
            and if we throw exceptions for the birds that don't fly then it would be a surprise for Client
            as he/she is expecting something else to happen
            SO we have to take this in consideration that clients don't like surprises
            so basically fly method should not be in the birds that can't fly.
         */
    }
}
