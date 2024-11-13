import java.util.Scanner;
public class Power {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = s.nextDouble();

        System.out.print("Enter the power: ");
        double power = s.nextDouble();

        // Calculate the power using Math.pow
        double result = Math.pow(base, power);

       
        System.out.println("Result: " + result);

       
        s.close();
    }
}


    

