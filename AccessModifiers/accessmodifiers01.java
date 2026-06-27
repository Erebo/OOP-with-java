/* same class er vitorer sobkichu access kora jay 
    So eta niye pera nai 
    Jodi amader folder different hoy , class different hoy then use korte hoy 
*/

class student{
    public String name;
    String id ;
    private int age;
    protected double cgpa;

    public student (String name,String id,int age,double cgpa){
        this.name = name;
        this.id = id;
        this.age = age;
        this.cgpa = cgpa;
    }

    public void showdetails(){
        System.out.println(name+","+id+","+age+","+cgpa);
    }
}

public class accessmodifiers01{
    public static void main(String[] args){
        student s1 = new student("Marrie kuri","007",23,3.84);
        s1.showdetails();
    }
}

// Folder different : package foldername; (trpr everything as it is)
// duto class er first ey package foldername likhe dite hobe

// class different : import foldername.*;
// .* -> oi class er sobkichu niye asha 
// but class different hole public bade r kichu access korte parbo na 