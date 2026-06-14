public class calculator {
    int result ;
    public void add1(int a,int b){
        result = a+b;
        System.out.println(result);
    }
    // method theke kisu return korte gele sey return type ta diye dite hobe 
    public int  add2(int a,int b){
        result = a+b;
        return result ; // result main block e pathate gele result return korte hobe 
    }    
}
