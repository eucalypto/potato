class ControlStructureTest
{
    public static void main(String[] arguments)
    {
        int n = 10;
        while(n < 20) {
            System.out.println("N = " + n);
            n++;
        }

        int mississipi = 1;
        do
            System.out.println(mississipi++ + " mississipi"); // sneaky counter increment inside print!
        while (mississipi < 10);


        for(int i = 0, j = 10; j > 0; i++, j--)
            System.out.println("I ate " + i + " pieces of bacon while " + j + " pieces are still left!");

        String[] names = new String[3];

        for(String name : names)
            System.out.println("name = " + name);

        String name = new String();
        System.out.println(name);

        int[] values = new int[3];
        values[0] = 1;
        values[1] = new Integer(2); // Why does this compile?
        // values[2] = "string"; // error: incompatible types: String cannot be converted to int
        // values[2] = 130L; // error: incompatible types: possible lossy conversion from long to int
        values[2] = (short) 4; // Works.
        // Apparently, java can automatically convert from class Integer to type integer.


        ControlStructureTest bacon = new ControlStructureTest();
        bacon.nestedLoops();
    }

    void nestedLoops()
    {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};

        System.out.println(matrix.length);

        for(int[] row : matrix)
        {
            for(int coordinate : row)
                System.out.print(coordinate + "\t");
            System.out.println();
        }

    }


}
