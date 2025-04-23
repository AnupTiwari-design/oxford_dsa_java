package collections.arraylist;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList of Student
        ArrayList<Student> students = new ArrayList<>();

        // Add objects to the ArrayList
        students.add(new Student(1, "Anup"));
        students.add(new Student(2, "Ravi"));
        students.add(new Student(3, "Priya"));

        // Access and print data
        for (Student s : students) {
            s.display();
        }

        // Or access individual fields
        System.out.println("First student's name: " + students.get(0).name);
    }
}
