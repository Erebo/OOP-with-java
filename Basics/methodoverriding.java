/* So this is how method overriding works like , 
ami jodi kono parent class er metod pochondo na 
hoy and for my child class if i want to use something
different mehtod info i can just copy the method 
name from the parent class and use it with my 
customized info.

Like ekhane ami chay amar kutta meat khak tai 
ami parent er oi method name hubohu copy paste koresi 
(method name exact copy paste na korle overriding hobe na)
and customized koresi. 

main e jokhon d1.eat() call kora hoy tokhon first 
e dog child class e eat() method search kore , 
child class e na thakle parent class e check kore.
ar special.dog() ---> diye parent class er eat() method 
o access kora jay . 
It means we can use both 
*/

class animal{
    public String species;
    public animal(String species){
        this.species = species;
        
    }
    public void eat(){
        System.out.println(species+" is eating grass.");
    }
}

class dog extends animal{
    public int legs;
    public String color;
    public dog(String sepcies,String color , int legs){
        super(sepcies);
        this.color = color ;
        this.legs = legs;
    } 
    public void eat(){
        System.out.println(species+" is eating meat.");
        super.eat();
    }
    public void showdetails(){
        System.out.println(species+","+color+","+legs);
    }
}

public class methodoverriding{
    public static void main(String [] args){
        dog d1 = new dog ("Dog","Golden",4);
        d1.eat();
        d1.showdetails();
    }
}