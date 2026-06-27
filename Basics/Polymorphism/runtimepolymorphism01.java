/*
The compiler doesn't know which method will run. Java decides it while the program is running.
Upcasting 
Downcasting 
*/

class animal{
    public void makesound(){
        System.out.println("Animal Sound :--------");
    }
}

class dog extends animal{
    public void makesound(){
        System.out.println("Dog Sound : Bhao Bhao ");
    }
}

class cat extends animal{
    public void makesound(){
        System.out.println("Cat Sound : Mew Mew ");
    }
}


public class runtimepolymorphism01{

    public static void sound(animal a){
        a.makesound();
    }
    public static void main(String[] args){
        animal a1 = new animal();
        dog d1 = new dog();
        cat c1 = new cat();

        a1.makesound();


        animal a2 = new dog(); // Upcasting 
        a2.makesound();

        dog d2 = new dog();

        animal a3 = (animal)c1; // Upcasting 


        a3.makesound();
        d2.makesound();
        d1.makesound();



        sound(d2); // Upcasting 
        sound(c1); // Upcasting 
    }
}

//Runtime polymorphism always uses the object type, not the reference type