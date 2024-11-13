import java.util.Scanner;
public class method_cadd {
    public static void main(String[] args) {
    
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c=add(a,b);
        System.out.println("Sum of "+a+" and "+b+" is: "+c);


    }

    public static int add(int x, int y) {
        return x + y;
    }
}
