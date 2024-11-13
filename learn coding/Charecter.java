import java.util.Scanner;
class Charecter{
public static void main(String[] args){
    String string;
    char ch;

    Scanner obj=new Scanner(System.in);
    System.out.print("enter a string/Line: ");
    string=obj.nextLine();
    System.out.println("You entered: " + string);
    System.out.print("enter a character: ");
    ch=obj.next().charAt(0);//only getting the first character of a string word like if we get input "sourav" but output is only first character 's'
    System.out.print("You entered: " +ch);
}
}
