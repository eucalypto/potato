import java.util.ArrayList;

class ArrayGun
{
    public static void main(String[] args)
    {
        ArrayGun agun = new ArrayGun();
        agun.declarations();
        agun.arrayListEnumerationCollection();
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

    public void arrayListEnumerationCollection()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("there.");
        list.add(String.valueOf(Boolean.TRUE));
        System.out.println(list);


        ArrayList list2 = new ArrayList();
        list2.add("Hello");
        list2.add("there.");
        list2.add(String.valueOf(Boolean.TRUE)); // works fine
        list2.add(Boolean.TRUE); // this is allowed because list2 is a "List" object storing references to all kinds of objects.
        list2.add(true); // funnily, this works as well
        // The two lines above give a compiler note:
        // Note: ArrayGun.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.

        System.out.println(list2);
    }
}
