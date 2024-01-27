public class NonPrime {
    public static void main(String[] args) {
        //Non-Primitive types - objects
        //Java Type Casting - Widening casting
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt); // 9
        System.out.println(myDouble); // 9.0

        //Narrow casting
        double yourDouble = 9.87d;
        int yourInt = (int) yourDouble;

        System.out.println(yourDouble); //9.87
        System.out.println(yourInt); // 9
    }
}