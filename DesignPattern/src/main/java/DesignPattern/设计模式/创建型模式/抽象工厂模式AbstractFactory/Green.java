package 设计模式.创建型模式.抽象工厂模式AbstractFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
