abstract class shape{
    private String color;
    public shape(String color){
        this.color = color;
    }
    public void getcolor(){
        System.out.println("The color of the shape is "+color);
    }
    abstract void area();
}

class circle extends shape{
    private double radius;
    public circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    public void area(){
        System.out.println("The area of the circle is "+3.1416*radius*radius);
    }
}

class rectangle extends shape{
    private double height;
    private double width;

    public rectangle(String color,double height,double width){
        super(color);
        this.height = height ;
        this.width = width;
    }
    public void area(){
        System.out.println("The area of the rectangle is "+height*width);
    }
}


public class abstraction01{
    public static void main(String [] args){
        shape obj1 = new circle("Blue",4.5);
        obj1.getcolor();
        obj1.area();

        rectangle obj2 = new rectangle("Green",4.5,5.5);
        obj2.getcolor();
        obj2.area();
    }
}