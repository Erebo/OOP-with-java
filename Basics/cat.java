public class cat {
    public String color = "Black";
    public String action = "sitting";

    public void change_action(String act){
        action = act;
    }
    public void change_color(String col){
        color = col;
    }
    public void show(){
        System.out.println("Cat is "+action);
        System.out.println("Cat color is "+this.color);
    }
    
}
