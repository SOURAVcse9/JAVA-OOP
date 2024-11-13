
import java.util.Scanner;
import java.util.Arrays;
class sort_copy_equal{
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<a.length;i++) {
            a[i]=s.nextInt();
        }

        //using sort function
        System.out.print("Sorting array: ");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

        int a2[]=Arrays.copyOf(a,5);
        System.out.print("\nCopied array: ");
        for(int i=0;i<a2.length;i++) {
            System.out.print(a2[i]+" ");
        }


    }
}