class Student {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Aman");
        s1.setAge(24);
        s1.getInfo();
        
        Student s2 = new Student();
        s2.setName("Shradha");
        s2.setAge(22);
        s2.getInfo();
    }
}
