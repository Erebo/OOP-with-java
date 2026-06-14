// public class tester
// {
//     public static void main(String[] args){
//         System.out.println("Hello World !");
//     }
// }

public class tester{
    public static void main (String[] args){
        // Classname variable = new Classname()
        student s1 = new student (); // Object 1
        student s2 = new student (); // Object 2
        student s3 = new student();
        student s4 = new student();
        int x = 5;
        s1.name = "Mahadi";
        s1.id = "008";
        System.out.println(5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.id);
        System.out.println(s2.name);
        s3.name = "Obito";
        s3.id = "007";
        System.out.println(s3.name+" "+s3.id);
        // Referencing Copy : 
        s1 = s3;
        s1.name = "Billu";
        System.out.println(s3.name);

        s4.name = "Robinson";
        s4.id = "1842";


        s1.method1(10,"Mahadi");
        System.out.println("================");

        s1.showdetails();

        System.out.println("================");

        s2.showdetails();

        System.out.println("================");

        s4.showdetails();

        System.out.println("================");


        s4.standup();
    }


}