/* 
polymorphism mane holo basically ami mahadi 
son , friend , brother , student erokom bohu role 
play kori etya . 
There is two type of polymorphism 
1.Complie time polymorphism -> Method overloading , Static Binding .
2.Run Time polymorphism -> Method Overriding , Dynamic Binding .
*/



class Animal {

    // Method 1
    public void eat() {
        System.out.println("Animal is eating.");
    }

    // Method 2 (Overloaded)
    public void eat(int times) {
        System.out.println("Animal is eating " + times + " times.");
    }

    // Method 3 (Overloaded)
    public void eat(String food) {
        System.out.println("Animal is eating " + food + ".");
    }
}

public class compiletimepolymorphism01 {

    public static void main(String[] args) {

        Animal a1 = new Animal();

        a1.eat();          // No parameter
        a1.eat(3);         // int parameter
        a1.eat("bread");   // String parameter
    }
}