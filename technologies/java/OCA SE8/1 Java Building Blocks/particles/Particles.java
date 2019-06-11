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
    }
    public void collide(){
    }

    public void propagate()
    {
        System.out.println("Propagate!");
    }
}
