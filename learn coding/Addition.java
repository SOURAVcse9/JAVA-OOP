import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        int i1,n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter beginning and ending number: ");
        i1=s.nextInt();
        n=s.nextInt();
        for(int i=i1;i<=n;i++){
            System.out.print(i+" "); 
            sum+=i;
        }
        System.out.println("Total Sum: "+sum);
    }

    
}
