public class multiclass{
    public static void main (String[] args){
        student s1 = new student("Boby",11);
        student s2 = new student ("Yamin",19);
        course c1 = new course ("OOP","CSE212",(float)7.5);
        course c2 = new course ("AOL","CSE201");
        s1.addcourse(c1);
        s2.addcourse(c2);
        s1.showdetails();

    }
}


class course{
    public String coursetitle;
    public String coursecode;
    public float courseduration;

    public course(){
        System.out.println("Course title , code , duration is not set yet.");
    }


    public course(String coursetitle,String coursecode,float courseduration){
        this.coursetitle = coursetitle;
        this.coursecode = coursecode;
        this.courseduration = courseduration;
    }

    public course(String coursetitle,String coursecode){
        this.coursetitle = coursetitle;
        this.coursecode = coursecode;
    }
}

class student{
    public String name;
    public int id ;
    public course [] courses = new course [5];
    public int coursecount = 0 ;


    public student (String name,int id){
        this.name = name;
        this.id = id ;  
    }
    public void addcourse(course C){
        courses[coursecount] = C;
        coursecount += 1;
    }


    public void showdetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Courses Taken :");
        for(int i = 0 ;i<coursecount;i++){
            System.out.println(courses[i].coursecode);
            System.out.println(courses[i].coursetitle);
        }
    }

}
