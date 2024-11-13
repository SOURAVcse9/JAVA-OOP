class A {
    int x = 10;
}

class B extends A {
    int x = 20;

    void display() {
        System.out.println("without super keyword: " + x);
        System.out.println("using super keyword: " + super.x);
    }
}

public class UseInstanceVariable {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
