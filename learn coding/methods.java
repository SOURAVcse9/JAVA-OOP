import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        findEvenWord(n);
}
public static void findEvenWord(int n)
{
    if(n%2 == 0)
    {
        System.out.println("The number is even.");
    }
    else
    {
        System.out.println("The number is odd.");
    }
}
    
}
