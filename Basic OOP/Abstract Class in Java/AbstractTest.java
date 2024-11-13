abstract class MobileUser{
    abstract void sendMessage();
}
class Rahim extends MobileUser{
    void sendMessage(){
        System.out.println("Hi, I am Rahim");
    }
}
class Karim extends MobileUser{
    void sendMessage(){
        System.out.println("Hi, I am Karim");
    }
}
class AbstractTest{
    public static void main(String args[]){
        MobileUser mu;//reference variable,,,in abstract class we can't create object
        mu = new Rahim();
        mu.sendMessage();
        mu = new Karim();
        mu.sendMessage();
    }
}