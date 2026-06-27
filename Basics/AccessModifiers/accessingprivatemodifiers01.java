/**
 * So we cannot access private , protected method as well as variables outside of the class
 * If we are in the same folder than we can just see the data but not access
 * to get access we need the get,set i mean a way inside the class to modify it 
 */


class student {
    private int age;
    protected double cgpa;

    public student(int age,double cgpa){
        this.age = age ;
        this.cgpa = cgpa;
    }

    public void get(){
        System.out.print(age+","+cgpa);
    }

    public void set(int age , double cgpa){
        this.age = age;
        this.cgpa = cgpa;
    }
}

public class accessingprivatemodifiers01{
    public static void main(String [] args){
        student s1  = new student(8,2.95);
        s1.get();
        s1.set(8888,222.999);
        s1.get();
    }
}