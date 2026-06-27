class student{
    public String name;
    public int id ;
    public student(String name,int id){
        this.name = name;
        this.id = id;
        System.out.println("Parent's constructor is being called.");
    }
    public void showdetails(){
        System.out.println(name+","+id);
    }
    public void laugh(){
        System.out.println(name+" (id:"+id+") is continuously laughing in the class.");
    }
}

class FSITstudent extends student{ 
    public double cgpa;
    public FSITstudent(String name , int id , double cgpa){
        super(name,id);
        this.cgpa = cgpa;
        System.out.println("Child's constructor is being called.");
    }

    public double result(){
        return cgpa;
    }
    public void cry(){
        System.out.println(name+" (id:"+id+") is crying as he got cgpa "+cgpa);
    }
}

class CSEstudent extends FSITstudent{
    public String coursecode;
    public CSEstudent(String name,int id , double cgpa,String coursecode){
        super(name,id,cgpa);
        this.coursecode = coursecode;
        System.out.println("Grand child's constructor is being called.");
    }

    public void enrolled(){
        System.out.println(name+" enrolled in CSE212");
    }
}

public class multilevelinheritance01{
    public static void main(String [] args){
        CSEstudent s1 = new CSEstudent("Geblu",593,3.79,"AOL101");
        FSITstudent s2 = new FSITstudent("Bublu",395,3.88);
        s2.showdetails();
        s1.enrolled();
        s1.showdetails();
        s1.cry();
        s2.laugh();
        System.out.println(s2.result());
    }
}