
interface A{
    void show();
}
interface B{
    void show();
}
class C implements A,B{
    @Override
    public void show(){
        System.out.println("comes from A and B");
    }
}
public class InheritanceInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    } 
    
}
