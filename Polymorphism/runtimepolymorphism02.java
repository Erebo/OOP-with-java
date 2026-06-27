/* We don't need any check for upcasting 
but for down casting we need to check je amra downcasting korte parbo kina 
like ekhane dog ke cat e downcasting kora jacche na 
check korrar jonnoy instanceof use kora hoise 
 */

class Animal {

    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog Sound: Woof! Woof!");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat Sound: Meow! Meow!");
    }
}

public class runtimepolymorphism02 {

    public static void displayInfo(Animal a) { // Upcasting
    if (a instanceof Dog ){
        Dog d = (Dog) a; // Downcasting
// Downcasting korar maddhoem we got Dog class as reference 
// So bark method will work now .
// But jodi downcast na kortam tahole animal reference e 
// bark method na thakar jonno kaj korto na.
        d.makeSound();
        d.bark();
    }
     else if(a instanceof Cat){
        a.makeSound();
    } else{
        a.makeSound();
    }
    }
    public static void main(String[] args) {

        // Reference_Type variable = new Object();

        Dog d1 = new Dog();
        displayInfo(d1);

        // Downcasting e only dog deowa tai cat dile error asbe 
        //Cat c1 = new Cat();
        //displayInfo(c1);
// UPcasting always perfect , so d1 is a dog 
// d1 is also an animal 
    System.out.println(d1 instanceof Dog);
    System.out.println(d1 instanceof Animal);


    Animal a1 = new Animal();
    System.out.println(a1 instanceof Animal);

    System.out.println(a1 instanceof Dog);

    }
}