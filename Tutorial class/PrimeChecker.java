import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer.");
            return;
        }

        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("Error: Number should be greater than 1.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

