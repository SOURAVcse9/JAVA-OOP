public class Person {
    String name;
    int age;

    void display() {
        System.out.println("person Name: " + name);
        System.out.println("age: " + age);
    }
}

public class Teacher extends Person {
    String Qualification;

    @override
    void display() {
        System.out.println("person Qualification: " + Qualification);
        System.out.println("age: " + age);
        System.out.println("name: " + name);
    }
}

public class PolymorfisomTest {

    public static void main(String[] args) {
        Person p = new Person();
        p.display();

        Person.p = new Teacher();
        p.display();

    }
}
