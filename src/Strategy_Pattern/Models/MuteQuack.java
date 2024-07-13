package Strategy_Pattern.Models;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
