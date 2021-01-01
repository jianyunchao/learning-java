package 设计模式.创建型模式.工厂方法模式FactoryMethod;

/**
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。关系图：
 */
public class ShapeFactory {
    public Shape getCircle() {
        return new Circle();
    }

    public Shape getRectangle() {
        return new Rectangle();
    }

    public Shape getSquare() {
        return new Square();
    }
}
