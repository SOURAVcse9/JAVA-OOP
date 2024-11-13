import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){

        int a,b;
        
        System.out.print("Enter a value: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();

        System.out.print("Getting input value: "+a+" and "+b);

    }
    
}
