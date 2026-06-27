class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Mammal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class hybridinheritance01 {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.walk();
        d.bark();

        c.eat();
        c.walk();
        c.meow();
    }
}