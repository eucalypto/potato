public class TestClass
{
    public static void main(String[] args)
    {
        // Test code comes here!

        // For example:
        System.out.println("Hello, World!");

        for (int i = 0; i<1; i++) System.out.println("Yes!");

        int testing = 0;
        for (int i = 0, j = 0; i < 3; i++,j = j+2, testing += 4)
            System.out.println("" + i + j);
    }
}
