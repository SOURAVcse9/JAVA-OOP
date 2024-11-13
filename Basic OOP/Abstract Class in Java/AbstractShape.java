abstract class Shape{
    double a,b;
    Shape(double a,double b){
        this.a=a;
        this.b=b;
    }
    abstract void area();
}
class Rectangle extends Shape{
    Rectangle(double a,double b){
        super(a,b);
    }
    void area(){
        double result=a*b;
        System.out.println("Area of Rectangle: "+result);
    }
}
class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    void area(){
        double result=0.5*a*b;
        System.out.println("Area of Triangle: "+result);
    }
}
class AbstractShape{
    public static void main(String args[]){
        Shape s;
        s=new Rectangle(10,20);
        s.area();
        s=new Triangle(5,10);
        s.area();
    }
}

