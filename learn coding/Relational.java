import java.util.Scanner;
public class Relational {

    public static void main(String[] args){
        int a,b;//a=10
        System.out.print("enter two numbers: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        
        System.out.println(a%2==0);
        System.out.println(b%2==0);
        System.out.println(a+b);
        System.out.println((a+b)%2==0);
        

        
    }
}
