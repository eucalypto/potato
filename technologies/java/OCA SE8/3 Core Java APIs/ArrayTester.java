import java.util.*;

public class ArrayTester {
    static int[][] arr7;
    public static void main(String... args) {
        String[] array = {"1", "10", "010", "10000", "9", "a", "A"};

        System.out.println(Arrays.binarySearch(array, "11"));

        Arrays.sort(array);

        System.out.println(Arrays.binarySearch(array, "11"));
        System.out.println(Arrays.binarySearch(array, "0"));
            // Does not find but it should be inserted in position 0, but
            // since the output "0" is used for found elements, it starts with
            // -1.

        // Why would you use anything but this high-level loop??? I love this.
        for (String string : array) {
            System.out.println(string);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] arr2 = new String[3];
        System.out.println(arr2[0]);

        int[] arr3 = new int[4];
        System.out.println(arr3[2]);

        Integer[] arr4 = new Integer[4];
        System.out.println(arr4[2]);

        double[] arr5 = new double[4];
        System.out.println(arr5[2]);

        boolean[] arr6 = new boolean[4];
        System.out.println(arr6[2]);

        // References in arrays have the same default initializations as
        // instance variables.

        // arr7[7][7] = 4; // java.lang.NullPointerException

        List<Integer> arr8 = Arrays.asList(3,4,5,6);
        System.out.println(arr8);

        Integer[] arr91 = {7,8,9,10};
        List<Integer> arr9 = Arrays.asList(arr91);
        System.out.println(arr9);

        List<Integer> arr10 = Arrays.asList(new Integer[] {7,8,9,10});
        System.out.println(arr10);

        // List<String> arr11 = Arrays.asList(11,12,13); // Does not compile! :(
        // System.out.println(arr11);

        List arr12 = Arrays.asList(7,8,9,10, "eleven");
        System.out.println(arr12);
          // This works because List itself allows references to all Objects
          // and objects have the method toString() for printing!

        List<Integer> arr13 = Arrays.asList(11,12,13);

        int[] arr14 = {14,15,16};
        for (Object obj : arr14) System.out.println(obj);
        for (int obj : arr14) System.out.println(obj);

        Object obj = 'c';
        System.out.println(obj);
          // WTF!? Primitive types are also objects?!

    }
}
