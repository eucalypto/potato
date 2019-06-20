public class StringTheory
{
    public static void main(String[] arguments)
    {
        StringTheory st = new StringTheory();
        st.stringChecking();
    }

    public void stringChecking()
    {
        String str1 = new String("This string is not part of string pool.");
        String str2 = "This is managed by the string pool. Also notice the usage without 'new String()' but just double quotes!";

        String name = "Gandalf the Grey";

        System.out.println(name.toUpper());
    }
}
