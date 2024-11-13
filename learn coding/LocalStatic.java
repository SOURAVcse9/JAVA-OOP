public class LocalStatic {
    static int a = 10;// static variable

    static void function() {
        int b = 10;// local variable
        System.out.println(a + " " + b);

        a++;
        b++;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        System.out.println("calling:1");
        LocalStatic.function();
        System.out.println("calling:2");
        LocalStatic.function();
        System.out.println("calling:3");
        LocalStatic.function();
        System.out.println("calling:4");
        LocalStatic.function();

    }

}
  