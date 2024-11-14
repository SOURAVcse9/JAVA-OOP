package Basic OOP.Interface;

public class B{
    public void show(){
        System.out.println("comes from B");
    }
}
public class C{
    public void show(){
        System.out.println("comes from C");
    }
}
public class A extends B,C{
    public void show(){
        System.out.println("comes from B");
    }
    public void show(){
        System.out.println("comes from C");
    }

}
public class InheritanceClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    } 
}
