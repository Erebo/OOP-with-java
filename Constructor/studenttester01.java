
// No constructor written → Java creates a hidden default constructor.

// Constructor written by you → Java does not create the hidden default constructor.
public class studenttester01 {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        student s4 = new student();
        s1.name = "Rohan";
        s2.name = "Rahul";
        s1.id = 10;
        s2.id = 25;

        s1.show_details();
        s2.show_details();
    }   
}

class student{
    public String name; // instance variable
    public int id ;// instance variable

    public student(){
    System.out.println("A student object has been created.");
    this.name = name;
    this.id = id;
}

    public void show_details(){
        System.out.println(name+","+id);
    }
}

