class animal{
    public String name;

    public animal(String name){
        this.name = name;
        System.out.println(name+" is my pet.");
    }
    public void eat(){
        System.out.println(name+" is eating.");
    }
}

class dog extends animal{
    public String color;
    public dog(String name,String color){
        super(name);
        this.color = color;
    }
    public void bark(){
        System.out.println(color+" "+name+" is barking there.");
    }
}

public class singleinheritance01{
    public static void main(String [] args){
        animal a1 = new animal("jack");
        dog d1 = new dog("Sparrow","Brown");
        d1.bark();
        d1.eat();
        a1.eat(); 
    }
}