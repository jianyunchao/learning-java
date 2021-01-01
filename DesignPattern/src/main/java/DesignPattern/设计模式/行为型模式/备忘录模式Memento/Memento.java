package 设计模式.行为型模式.备忘录模式Memento;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
