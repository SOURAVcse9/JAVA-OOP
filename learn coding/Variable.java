public class Variable {
    int a = 50;// instance variable
    static int b = 60;// static variable

    public static void main(String[] args) {
        int c = 70;// local variable
        Variable v = new Variable();

        System.out.println(v.a);
        System.out.println(Variable.b);
        System.out.println(c);

    }
}
