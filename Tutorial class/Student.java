public class Student {
    // Data members
    private String name;
    private String dept;
    private int session;

    // Constructor
    public Student(String name, String dept, int session) {
        this.name = name;
        this.dept = dept;
        this.session = session;
    }

    // Methods to assign name, dept, session
    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSession(int session) {
        this.session = session;
    }

    // Methods to display name, dept, session
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Session: " + session);
    }

    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student("John Doe", "Computer Science", 2023);
        student1.displayDetails();
        
        // // Modify data
        // student1.setDept("Electrical Engineering");
        // student1.displayDetails();
    }
}

