package particles;
public class Particles
{
    double mass = 0;

    public Particles()
    {
        System.out.println("This is the construction of class 'Particles'");
    }

    public static void main(String[] args)
    {
        java.util.Random r = new java.util.Random();
        System.out.println(r.nextInt(10));
        System.out.println("This is Class Particles");
        Particles particle = new Particles();
        System.out.println("The mass is:");
        System.out.println(particle.mass);
        particle.primitiveTypes();
        particle.nameAllTheThings();
    }
    public void collide(){
    }

    public void propagate()
    {
        System.out.println("Propagate!");
    }

    public void primitiveTypes()
    {
        // What primitive variable types are there in Java?
        // 8 types:
        // boolean, byte, short, int, long, float, double, char

        boolean truthiness = false; // works!
        byte bite_size = 127; // works
        // byte bite_size1 = 128; // possible lossy conversion from int to byte
        int normal_size = 12; // works
        // normal_size = 12L; // possible lossy conversion from long to int
        long long_size = 13; // works
        long_size = 12344L;  // works

        // float goat = 123.0;  // possible lossy conversion from double to float
        float goat = 123.0f; // works
        double mass = 134_038_341.34; // we can put underscores (_) in between digits of numbers (added in Java7)

        System.out.println(37); // 37
        System.out.println(0b101); // 5
        // System.out.println(018); // error: integer number too large. Integers starting with "0" are viewed in octal system
        System.out.println(017); // 15
        System.out.println(0x17); // 23

        // char character = "C"; // Does not compile: double quotes denote a string!
        char character = 'c';
        System.out.println(character);
    }

    public void nameAllTheThings()
    {
        // Can we choose any identifiers?
        // Allowed characters:
        //  - letters
        //  - numbers
        //  - $ (dollar symbol)
        //  - _ (underscore)

        // BUT: first character must not be a number!
        // Also, reserved words are not allowed, duh!

        // String 1stPlace; // does not compile! can't start with number!
        int firstPlace; // works
        // int ImAnExpert@Java; // does not compile!
        int _this_is_legal;
        int this_is_alsoLegal;
        int _this$is$ridiculous$but$legal_;

        // But wait there's more!
        // Java supports Unicode!

        int lööps = 4; // does compile
        int München = 4; // Finally German umlauts!
        // int is_this_•_legal; // No!  illegal character: '\u2022'
        int whatAboutThis_8 = 0; // Yes
        int i_need_more_unicode_Æ_Ë_Ø_Þ_æ_ = 0; // works!
        int this_is_ridiculous_ð_Ą_Đ_Ħ_ĳ_ = 0;
        int this_is_a_trap_ĳ = 0; // The 'ĳ' is a single unicode character! Bamboozled!
        int this_is_allowed_ƹ = 0;

        int how_about_greek_μ_λ_β = 123;

        int i_think_i_have_made_my_point = -1;
        int theConventionIs;
        int startWithLowerCaseAndThenCamelCase;
        // Except classes
    }
}
