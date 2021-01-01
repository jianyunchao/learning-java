package java8;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("list");
        list.stream().forEach(System.out::println);
        System.out.println("Hello World!");
    }
}
