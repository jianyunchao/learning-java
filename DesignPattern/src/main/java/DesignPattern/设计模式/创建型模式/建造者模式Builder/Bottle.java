package 设计模式.创建型模式.建造者模式Builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
