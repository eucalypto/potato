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
        particle.numbers();
    }
    public void collide(){
    }

    public void propagate()
    {
        System.out.println("Propagate!");
    }

    public void numbers()
    {
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




    }
}
