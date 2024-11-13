import java.util.Scanner;

public class Recurtion {
    int n;
    int result;
    public static void main(String[] args) {
        Recurtion r = new Recurtion();
        r.input();
        r.process();
        r.output();
    }
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
    }
    int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
    void process() {
        result = sum(n);
    }
void output(){
    
    System.out.print("result:"+result);

}
}