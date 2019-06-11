package particles;
public class Particles
{
    public static void main(String[] args)
    {
        java.util.Random r = new java.util.Random();
        System.out.println(r.nextInt(10));
        System.out.println("This is Class Particles");
    }
    public void collide(){
    }

    public void propagate()
    {
        System.out.println("Propagate!");
    }
}
