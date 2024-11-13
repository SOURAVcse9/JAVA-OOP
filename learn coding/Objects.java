import java.util.Scanner;
public class Objects {
    public static class Object{
        String name;
        int value;
        void print(){
            System.out.println("Name: "+name+" Value: "+value);
        }
    }
    public static void main(String[] args){
        System.out.print("give input for 1st object: ");
        Scanner scan=new Scanner(System.in);
        //classname var=new classname();
        Object obj=new Object();
        obj.name=scan.nextLine();
        obj.value=scan.nextInt();
        obj.print();
//second object
        System.out.println("give output for 2nd object: ");
        Scanner temp=new Scanner(System.in);
        //classname var=new classname();
        Object obj2=new Object();
        obj.name=temp.nextLine();
        obj.value=temp.nextInt();
        obj.print();
        scan.close();
    }  
}
