package fields;
public class Fields
{
    public static void main(String[] args)
    {
        System.out.println("Hello, this is the Class Fields");
    }
    public void interact(particles.Particles particle)
    {
        particle.propagate();
        System.out.println("This is an interaction!");
    }
}
