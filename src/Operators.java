public class Operators {
    public static void main(String[] args){
        //Running Java operators
        int x = 100 + 50;
        System.out.println(x);
        //Arithemetic Operators
        //Division
        int num1 = 10;
        int num2 = 45;
        int sum = num2 / num1;
        System.out.println(sum);

        //Modulus
        int mod1 = 75;
        int mod2 = 3;
        int mainSum = mod2 % mod1;
        //System.out.println(mainSum);

        //Increament
        int incre = 1;
        ++incre;
        //System.out.println(incre);
        // Decrement
        int decre = 2;
        --decre;
        //System.out.println(decre);

        //Assignment Operators
        int value = 10;
        value += 5;
        //System.out.println(value);

        //Comparison Operators
        int five = 5;
        int three = 3;
        //System.out.println(five > three);

        //Logical Operators (&&, || and !)
        int four =40;
        int ten = 10;
        System.out.println(four < 50 && four >10);
        System.out.println(ten <9 || ten >= 10);
        System.out.println();
    }
}