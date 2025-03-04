package Strategy_Pattern;

import Strategy_Pattern.Models.FlyWithWings;
import Strategy_Pattern.Models.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck!!");
    }
}
