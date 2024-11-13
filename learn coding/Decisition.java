
//statement if,if else,ef else if,nested statements

import java.util.Scanner;

public class Decisition {
    public static void main(String[] args) {
        int age, sallary;
        System.out.println("enter your age: ");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        sallary = s.nextInt();
        if ((age > 21) && (sallary < 50000)) {
            System.out.println("You are Ready to marry a women");
            System.out.println("Wish you will be happy with yor married life");
        } else if ((age > 28) && (sallary > 50000)) {
            System.out.println("You get a good life partner");
        } else {
            System.out.println("Your are not ready to married a women");

        }

        System.out.println("Thank you");
    }

}
