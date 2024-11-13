public class Constructor {
    int id;
    String name;
    Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id + "\nName: " + name);
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor(1, "sourav");
        Constructor c2 = new Constructor(2, "ramesh");
        c1.display();
        c2.display();
    }
}
