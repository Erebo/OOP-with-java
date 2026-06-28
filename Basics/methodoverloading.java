class Student {

    void showDetails() {
        System.out.println("Student Details");
    }

    void showDetails(String name) {
        System.out.println("Name: " + name);
    }

    void showDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class methodoverloading {

    public static void main(String[] args) {

        Student s = new Student();

        s.showDetails();
        s.showDetails("Mahadi");
        s.showDetails("Mahadi", 20);
    }
}