//package Basic OOP.basic-JAVA-OOP.Polymorphism.super keyword;

class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    @Override//annotation for method overriding
    void display() {
        super.display();//calling the parent class method using the super keyword
        System.out.println("Class B");
    }
}
public class UseMethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
    
}
