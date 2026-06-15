public class studenttester02{
    public static void main(String[] args){
        student s1 = new student("Carlos",10);
        student s2 = new student("Magnus",20);
        student s3 = new student();



        s1.show_details();
        s2.show_details();
        s3.show_details();
    }
}

class student{
    public String name; // instance variable
    public int id; // instance variable 


    public student(String name,int id){ // constructor with parameters
        System.out.println("A student object with parameter has been created.");
        this.name = name;
        this.id = id;
    }


    public student(){ // constructor without parameters
        System.out.println("A student object without parameter has been created.");
    }

    public void show_details(){ // instance method 
        System.out.println(name+","+id);
    }
}