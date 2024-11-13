public class Ternary{
    public static void main(String[] args){
        int a=10,b=30,c=2000,max;
        max=((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.print(max);
    }
}