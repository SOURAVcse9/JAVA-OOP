// Parent class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Child class that extends Parent
class Child extends Parent {
    // Overriding the show() method of Parent class
    void show() {
        super.show(); // calling parent's show() method
        System.out.println("Child's show()");
    }
}

    // Main method to run the program
    class Super {
    public static void main(String[] args) {
        // Creating an instance of Child
        Child c = new Child();
        c.show(); // This will call the show() method of Child
    }
}
