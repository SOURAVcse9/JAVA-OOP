import java.util.Scanner;
public class Logical {
    public static void main(String[] args){
        int a,b,c;
        System.out.print("enter two numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println((a%2==0)&&(b%2==0));
        System.out.println(a>b&&a>c);
        System.out.println(b>c&&b>a);
        System.out.println(c>b&&c>a);




    }
    
}
