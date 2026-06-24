public class constructoroverloading{
    public static void main(String[] args){
        car c1 = new car();
        car c2 = new car("BMW","M4");
        car c3 = new car("Toyota","Premio",256);
        c1.show();
        c2.show();
        c3.show();
    }
}


class car{

    public String brand;
    public String model;
    public int milage;


    public car(){

    }

    public car(String brand,String model){
        this.model = model ;
        this.brand = brand;
    }

    public car(String brand , String model , int milage){
        this.brand = brand;
        this.model = model;
        this.milage = milage;
    }

    public void show(){
        System.out.println(brand+","+model+","+milage);
    }




}