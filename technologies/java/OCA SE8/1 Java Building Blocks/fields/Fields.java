package fields;
import particles.Particles;
public class Fields
{
    public Fields()
    {
        System.out.println("This is the constructor of class Fields");
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, this is the Class Fields");

        Particles particle = new Particles();
    }

    public void interact(particles.Particles particle)
    {
        particle.propagate();
        System.out.println("This is an interaction!");
    }
}
