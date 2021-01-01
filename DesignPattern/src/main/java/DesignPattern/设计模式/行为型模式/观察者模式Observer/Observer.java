package 设计模式.行为型模式.观察者模式Observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
