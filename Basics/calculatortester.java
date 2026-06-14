public class calculatortester {
    public static void main(String[] args){
        calculator c1 = new calculator();
        // case 01:
        c1.add1(4,5);


        // Case 02:
        // What if we want to store the result from the method 
        calculator c2 = new calculator();

        int result = c2.add2(7,8);

        System.out.println(result);

// Direct o return niye eshe kaj kora jay 
        System.out.println(c2.add2(10,20));
    }
}
