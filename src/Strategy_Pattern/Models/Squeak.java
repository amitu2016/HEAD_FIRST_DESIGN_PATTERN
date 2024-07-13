package Strategy_Pattern.Models;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
