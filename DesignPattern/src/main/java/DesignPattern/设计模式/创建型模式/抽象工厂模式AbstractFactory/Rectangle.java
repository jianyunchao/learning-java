package 设计模式.创建型模式.抽象工厂模式AbstractFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
