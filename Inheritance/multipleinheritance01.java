// Java does not support multiple inheritance using classes.
// Java supports multiple inheritance through interfaces.

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class multipleinheritance01 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();
    }
}