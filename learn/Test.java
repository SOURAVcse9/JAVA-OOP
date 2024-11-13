public class Test{
    class test{
        static int a = 10;
        static class Inner{
            static void msg(){
                System.out.println("data is "+a);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        Test.test.Inner.msg();
    }
}