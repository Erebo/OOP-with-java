// Instance variable e jotobar new object create hoy 
// for each object count 0 theke start hoy 
// Static variable can be called by classname._____
// or objectname._____
// Constructor is a special method that is being called for only one time for each object 
// So amra count clock ta constructor er vitorey dibo object call korar jonno 

class student{
    public String name;
    public int id ;
    public static int count = 0;

    public student(String name,int id){
        this.name = name;
        this.id = id;
        count += 1;
    }

    public void showdetails(){
        System.out.println(name+","+id);
    }
}

public class countobject{
    public static void main(String [] args){
        System.out.println("Inital Object Count :"+student.count);
        student s1 = new student("Karim",11);
        student s2 = new student("Benzema",1);
        student s3 = new student("Karls",011);
        student s4 = new student("Magnus",01);
        System.out.println("Final Object Count :"+student.count);
        student.count = 545; // we can also change this 
        System.out.println("Custom Object Coutn :"+student.count);
        System.out.println("Custom Object Count for s2 :"+s2.count);
    }
}