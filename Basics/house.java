public class house {
    public int window ; // Instance variable 
    public int door;  // Instance variable

    public void increasedoor(int dr){ /// Here this dr is a local variable 
        door = door + dr;
    }
    public void view(){  // Instance method 
        System.out.println(window+" Windows");
        System.out.println(door+" Doors");
    }
}
