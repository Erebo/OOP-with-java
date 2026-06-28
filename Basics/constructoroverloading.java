class Student {

    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructoroverloading {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Mahadi");
        s2.showDetails();

        Student s3 = new Student("Rahim", 20);
        s3.showDetails();
    }
}