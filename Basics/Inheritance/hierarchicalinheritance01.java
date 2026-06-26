class student{
    public String name;
    public String section;
    public int number;

    public student(String name, String section,int number){
        this.name = name;
        this.section = section;
        this.number = number;
        System.out.println("Parent's constructor is being called.");
    }

    public void party(){
        System.out.println(name+" "+"-"+section+" is doing party.");
    }

    public void showdetails(){
        System.out.println(name+","+section+","+number);
    }
}

class csestudent extends student{
    public double coursecode;
    public csestudent(String name,String section,int number,double coursecode){
        super(name,section,number);
        this.coursecode = coursecode;
        System.out.println("CSE constructor is being called.");
    }

    public void partycse(){
        System.out.println(name+" are not having party.");
    }
    public double code(){
        return coursecode;
    }
    public void showdetailscse(){
        System.out.println(name+","+number+","+coursecode);
    }
}

class bbastudent extends student{
    public double courseduration;
    
    public bbastudent(String name,String section ,int number , double courseduration){
        super(name,section,number);
        this.courseduration = courseduration ;
        System.out.println("BBA Constructor is being called.");

    }

    public void vacation(){
        System.out.println(name+" from "+section+" is having vacation for "+number+" days.");
        System.out.println("Total course duration is "+courseduration+" hours.");
    }

    public void showdetailsbba(){
        System.out.println(name+","+section+","+number+","+courseduration);
    }
}

public class hierarchicalinheritance01{
    public static void main(String[] args){
        csestudent cse1 = new csestudent("Nazrul","A",8,40.1);
        csestudent cse2 = new csestudent("Mokhles","Z",8,3.5);
        csestudent cse3 = new csestudent("Jasimuddin","P",5,6.9);
        cse1.showdetailscse();
        cse1.showdetails();
        cse2.party();
        System.out.println(cse3.code());
        cse3.partycse();


        bbastudent bba1 = new bbastudent("Babita","Golap",101,49.5);
        bbastudent bba2 = new bbastudent("Rifa","Rojinogandha",5,12.5);
        bba1.showdetailsbba();
        bba2.vacation();
        bba1.showdetails();
        bba2.party();
        
    }
}