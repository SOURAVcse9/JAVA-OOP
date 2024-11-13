class Animal {  
    void eat() {
        System.out.println("eating...");
    }  
}  

class Dog extends Animal {  
    void bark() {
        System.out.println("barking...");
    }  
}  

class Cat extends Animal {  
    void meow() {
        System.out.println("meowing...");
    }  
}  

class HierarchicalInherit {  
    public static void main(String args[]) {  
        Cat c = new Cat();  
        c.meow();  // Cat-specific method
        c.eat();   // Inherited from Animal
        
        // Uncommenting the line below will cause a compile-time error
        // c.bark();  // Error: Cat does not have the bark() method
    }  
}
