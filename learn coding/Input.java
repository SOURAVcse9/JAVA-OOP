import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        System.out.print("Enter a data: ");
        Scanner show = new Scanner(System.in);
        String a = show.nextLine();
        
        Scanner integer=new Scanner(System.in);
        int b=integer.nextInt();
        
        System.out.println("Getting string line: "+a);
        System.out.print("Integer int value:"+b);
    }

    
}
