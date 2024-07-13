package Strategy_Pattern;

import Strategy_Pattern.Models.FlyNoWay;
import Strategy_Pattern.Models.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck!!");
    }
}
