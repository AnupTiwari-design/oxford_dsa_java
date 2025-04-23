package Abstraction;

public class ex1 implements test {
    int c;

    public void add(int a, int b) {
        this.c = a + b;
    }

    public void display() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        ex1 ob = new ex1();
        ob.add(3, 4);
        ob.display();  // Output: 7
    }
}