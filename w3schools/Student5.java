public class Student5 {
    int id;
    String name;
    int age;
    Student5(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student5 student1 = new Student5(1, "John Doe", 20);
        student1.display();
    }
    
}
