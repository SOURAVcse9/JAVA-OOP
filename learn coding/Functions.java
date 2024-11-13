import java.util.Scanner;

public class Functions {
    int n1, n2, add, sub, mul, div, rem;
    public static void main(String[] args) {
        Functions ref = new Functions();
        ref.input();
        ref.process();
        ref.output();
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
    }

    void process() {
        add = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        if(n2 != 0) {
        div = n1 / n2;
        rem = n1 % n2;
        }
        else{
            div=0;
            rem=0;
        }
    }
    void output() {
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
    }

}
