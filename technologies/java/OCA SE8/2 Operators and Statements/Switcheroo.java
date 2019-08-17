/*
Let's see how we can break the switch statement.
*/

public class Switcheroo {
    public static void main(String... args) {
        // int int1 = 1; // error: constant expression required
        // final int int1 = 1; // error: duplicate case label
                            // the compiler sees that we already have a case of 1
        final int int1 = 2;

        final int int2 = 4;

        // int decision; //error: variable decision might not have been initialized
        Integer decision = 5;

        switch(decision) {
            case 1:
                System.out.println("case 1");
                break;
            default:
                System.out.println("default");
                break;
            case int1:
                System.out.println("case 2");
                break;
            case int2:
                break;
        }

        switch (decision) {

        }


    }
}
