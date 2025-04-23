package Abstraction;

public interface test {
    void add(int a, int b);  

    default void display() {
        System.out.println("default display");
    }
}