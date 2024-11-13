import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        int a,b,choice;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a=s.nextInt();
        b=s.nextInt();

        System.out.println("Enter Your Choice: ");
        choice=s.nextInt();
        switch(choice){
            case 1:System.out.print("Sum: "+(a+b));
            break;
            case 2:System.out.print("Sub: "+(a-b));
            break;
            case 3:System.out.print("Mult: "+(a*b));
            break;
            case 4:System.out.print("Div: "+(a/b));
            break;
            default:System.out.print("Enter valide choice");
        }

    }
    
}
