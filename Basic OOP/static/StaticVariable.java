 class Student {
    String id;
    String name;
    static String varsity = "University of Barishal";

    // Constructor
   Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    void display() {
        System.out.println(id + " " + name + " " + varsity);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        // Creating Student objects with string IDs
        Student s1 = new Student("22CSE009", "Sourav Debnath");
        Student s2 = new Student("22CSE017", "Utsohjit Paticor");

        // Displaying Student information
        s1.display();
        s2.display();
    }
}
