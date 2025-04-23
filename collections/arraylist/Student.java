package collections.arraylist;

public class Student {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student info
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}