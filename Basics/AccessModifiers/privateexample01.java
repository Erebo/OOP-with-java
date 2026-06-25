// When we are making anything private , we can't use it outside that specific class
// To access the private resource we need to design method . 
public class privateexample01{
    public static void main(String [] args){
        student s1 = new student("Bob",15);
        student s2 = new student("Marley",20);
        s1.showdetails();
        s1.updateid(504);
        s1.showdetails();
        s2.showdetails();
    }

}

class student {
    public String name;
    private int id ;


    public student (String name,int id){ // Constructor
        this.name = name;
        this.id = id;
    }

    public void updateid(int id){ // method
        if (id > 10){
        this.id = id;
    }
     else {
        System.out.println("Invalid id given.");
    }
    }

    public void showdetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}


// So kono kisu private kora thakle sekhaner data update korete method use kora lage .