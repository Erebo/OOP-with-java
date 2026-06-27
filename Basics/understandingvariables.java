// File Name: understandingvariables.java

class Student {

    String name;

    static String university = "DIU";

    Student(String name) {
        this.name = name;
    }

    public void showDetails() {

        String subject = "OOP";
        int semester = 3;

        System.out.println("Local Variable (Subject): " + subject);
        System.out.println("Local Variable (Semester): " + semester);

        System.out.println("Instance Variable (Name): " + this.name);

        System.out.println("Static Variable (University): " + Student.university);

        System.out.println("------------------------------");
    }
}

public class understandingvariables {

    public static void main(String[] args) {

        Student s1 = new Student("Mahadi");
        Student s2 = new Student("Rahim");

        System.out.println("=== Before Changing Static Variable ===");
        s1.showDetails();
        s2.showDetails();

        Student.university = "BUET";

        System.out.println("=== After Changing Static Variable ===");
        s1.showDetails();
        s2.showDetails();
    }
}