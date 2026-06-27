/* The owner of an instance variable is an object
so object count korley 0 theke suru hoy 
we need something jekhan sokol object can add or update their count
This cannot be possible with instance variable 
So , here comes static variable : 
The owner of a Static Varibale is a Class, 
so class er under jesokol object ase they can update and store their 
count on static variable.*/

class player{
    public int run = 0; // Instance Variable 
    static int teamrun = 0; // Static Variable

    public void hitfour(){
        run = run + 4;
        teamrun =  teamrun + 4;
    }

    public void hitsix(){
        run = run + 6;
        teamrun = teamrun + 6;
    }
}

public class staticvariables01{
    public static void main(String [] args){
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

        System.out.println("Initial Team run : "+player.teamrun);

        p1.hitsix();
        p1.hitfour(); 


        p2.hitsix();
        p2.hitsix();
        p2.hitfour();
        p2.hitfour();


        
        System.out.println("P1 run : "+p1.run);
        System.out.println("P2 run : "+p2.run);
        System.out.println("P3 run : "+p3.run);


        System.out.println("Final Team run : "+player.teamrun);  
    }
}
