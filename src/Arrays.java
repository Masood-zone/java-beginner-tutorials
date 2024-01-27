public class Arrays{
    public static void main(String[] args) {
        //Java Arrays
        //An array of strings
        String[] cars = {"Benz", "Lexus", "Ford", "Mustang"};
        //An array of integers
        int[] numbers = {20,10,04,301};
        //Accesing the elements of an array
        System.out.println(cars[2]);
        System.out.println(numbers[1]);

        //Changing an array's element
        cars[0] = "Lambo";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        //Storing different types in an array in Java requires using the Object keyword
        Object[] mixedArry = new Object[2];
        mixedArry[0] = 29.30;
        mixedArry[1] = "Konichiwa";
        //System.out.println(mixedArry[0]);
        //System.out.println( mixedArry[1]);

        String[] carz = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : carz) {
            System.out.println(i);
        }
}