
// Method Overloading : 
// When a class have multiple methods with same name and different number of parameters -> This situation is called method overloading . 
// Only one public class per file .
public class dogtester {
    public static void main(String[] args) {
        dog d1 = new dog(); // objects
        dog d2 = new dog();

        d1.name = "Bagha";
        d1.name();
        d1.eat();
        d1.eat(5);
        d1.eat("meat");
        d1.eat("protin shake", "meat");
        d1.eat("chicken legs", "5");

    }

}

class dog {
    public String name;

    public void eat(String a) {
        System.out.println("Dog is eating " + a);
    }

    public void eat(String a, String b) {
        System.out.println("Dog is eating " + a + " and " + b);
    }

    public void eat(String a,int b){
        System.out.println("Dog is eating "+a+" for "+b+" times a day.");
    }

    public void eat() {
        System.out.println("Dog is not eating anything.");
    }

    public void eat(int a){
        System.out.println("Dog is having "+a+" meals a day.");
    }

    public void name() {
        System.out.println("The name of the dog is " + name);
    }

}