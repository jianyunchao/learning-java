package 设计模式.行为型模式.命令模式Command;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+"," +
                "Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", " +
                "Quantity: " + quantity +" ] sold");
    }
}