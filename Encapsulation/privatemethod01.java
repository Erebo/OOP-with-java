// To access the private variables we need to write public metods 
// To access the private methods we need to public methods
public class privatemethod01{
    public static void main(String [] args){
        student s1 = new student("Bob",15);
        student s2 = new student( "Marley",504);
        s1.showdetails();
        s2.showdetails();
    }
}

class student{
    private String name;
    private int id ;

    public student(String name,int id){
        this.name = name;
        this.id = id;
    }
    private double calculatecgpa(){
        return 4.0;
    }

    public void showdetails(){
        double cg = calculatecgpa();
        System.out.println("Name: "+name);
        System.out.println("ID: "+ id);
        System.out.println("CGPA :"+cg);
    }
}