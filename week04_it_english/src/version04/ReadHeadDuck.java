package version04;

public class ReadHeadDuck extends Duck implements Quackable, Flyable{
    public ReadHeadDuck() {
        this.name = "아메리칸흰죽지 오리";
    }

    @Override
    public void display() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {
        System.out.println("꽥꽥~");
    }
}
