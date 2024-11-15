class Power {
    int x;

    static int square(int x) {
        return x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        int result = Power.square(5);// calling without creating object
        System.out.println("Square of 5 is: " + result);

    }

}

// another way to solve this problem
class Power {
    static int result; // Make result static

    static int square(int x) {
        result = x * x;
        return result;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Power.square(5); // Calling static method without creating an object
        System.out.println("Square of 5 is: " + Power.result); // Access result using the class name
    }
}
