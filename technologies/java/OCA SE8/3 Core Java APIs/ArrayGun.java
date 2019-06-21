class ArrayGun
{
    public static void main(String[] args)
    {
        ArrayGun agun = new ArrayGun();
        agun.declarations();
    }

    public void declarations()
    {
        // Those compile, but why would you use anything but the first one?
        int[] intArray1;
        int [] intArray2;
        int intArray3[];
        int intArray4 [] = {3,4,5};

        // What about declaring several arrays in one go?
        int[] array1, array2; // Works as expected! :)
        int array3[], array4; // What is going on here!? This still compiles somehow.
        // array3 = 4; // error: incompatible types: int cannot be converted to int[]
        array3 = new int[] {4,1};
        array4 = 4; // bamboozle! array4 is an int!
    }
}
