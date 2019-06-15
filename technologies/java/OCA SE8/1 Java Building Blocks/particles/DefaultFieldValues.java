public class DefaultFieldValues
{
    private String name; // auto-initialized to null
        // All references are auto-initialized to null
    private boolean condition; // auto-initialized to false
    private int integer; // auto-initialized to 0
    private char character; // auto initialized to '\u0000' (NUL)
        // NUL is apparently the "null" character, doing nothing
    private float floatingpoint; // auto-initialized to 0.0

    public static void main(String[] args)
    {
        DefaultFieldValues wb = new DefaultFieldValues();
        System.out.print("Condition = " + wb.condition);
        System.out.print(", Name = " + wb.name);
        System.out.print(" , Integer = " + wb.integer);
        System.out.print(" , Character = " + wb.character);
        System.out.println(" , Float = " + wb.floatingpoint);
    }
}
