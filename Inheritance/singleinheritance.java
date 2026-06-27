class student {
    public String name;
    public int id;

    public void doclass() {
        System.out.println(name + " is doing theory class.");
    }

    public void showdetails() {
        System.out.println("Student name is " + name);
        System.out.println("Student id is " + id);
    }
}

class csestudent extends student {

    public csestudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void dolabclass() {
        System.out.println(name + " is doing lab class.");
        System.out.println(name + "'s id is " + id);
    }
}

public class singleinheritance {

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Jotay";
        s1.id = 67;

        csestudent s2 = new csestudent("Topshe", 17);

        s1.doclass();
        s1.showdetails();

        System.out.println();

        s2.doclass();      // Inherited from student
        s2.dolabclass();   // Own method
        s2.showdetails();  // Inherited from student
    }
}

/*
class student {
    public String name;
    public int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void doclass() {
        System.out.println(name + " is doing theory class.");
    }

    public void showdetails() {
        System.out.println("Student name is " + name + ", and student id is " + id);
    }
}

class csestudent extends student {
    public String coursename;

    public csestudent(String name, int id) {
        super(name, id);   // Calls the parent constructor
    }

    public void dolabclass() {
        System.out.println(name + " is doing lab class.");
        System.out.println(name + "'s id is " + id);
    }
}

public class singleinheritance {
    public static void main(String[] args) {

        student s1 = new student("Jotay", 67);

        csestudent s2 = new csestudent("Topshe", 17);

        s1.doclass();
        s1.showdetails();

        System.out.println();

        s2.doclass();      // Inherited from student
        s2.dolabclass();   // Child's own method
        s2.showdetails();  // Inherited from student
    }
}
*/
