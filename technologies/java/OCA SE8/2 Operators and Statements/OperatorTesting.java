public class OperatorTesting
{
    public static void main(String[] args)
    {
        // What happpens if we use operators on a char?
        char character = 'c';
        System.out.println(character++); // c
        System.out.println(++character); // e
        System.out.println(character + 0); // 101

        // Modulo (remider) can also be done with floating numbers:
        System.out.println("12.4 / 3.6 = " + (12.4 / 3.6)); // 3.4444444444444446
        System.out.println("3.6 * 3 = " + 3.6 * 3);         // 10.8
        System.out.println("12.4 % 3.6 = " + (12.4 % 3.6)); // 1.6
        System.out.println("12.4 % -3.6 = " + 12.4 % -3.6); // 1.6
        System.out.println("-12.4 % 3.6 = " + -12.4 % 3.6); // -1.6




        // Assignment operators
        long x = 50;
        int y = 30;
        // y = y * x; // error: incompatible types: possible lossy conversion from long to int
        y *= x; // This works! The compound assignment operator does an automatic cast to int


        int z = (y = 7); // This is valid! The assignment operator assigns and returns the value!

        System.out.println(y);
        System.out.println(y = 13);
        System.out.println(y);

    }
}
