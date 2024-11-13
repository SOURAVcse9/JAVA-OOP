public class ChangingDatatypes{
    public static int Add(int a, int b){
        return a + b;
    }
    public static int Add(int a, int b, int c){
        return a + b + c;
    }
    public static double Add(double a, double b){
        return a + b;
    }
    public static double Add(double a, double b, double c){
        return a + b + c;
    }
    public static void main(String[] args){
        System.out.println(Add(1, 2));
        System.out.println(Add(1, 2, 3));
        System.out.println(Add(1.0, 2.0));
        System.out.println(Add(1.0, 2.0, 3.0));
    }
}