public class housetester{
    public static void main(String [] args){
    house h1 = new house();
    house h2 = new house();
    h1.window = 5;
    h1.door = 5;
    h2.window = 10;
    h2.door = 10;
    

    h1.view();
    h2.view();


    h1.increasedoor(15);

    h1.view();
}
}