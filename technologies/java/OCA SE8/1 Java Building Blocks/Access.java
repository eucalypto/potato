public class Access {
    public static void main(String[] args) {
        LeaveMeAlone leave = new LeaveMeAlone();
        System.out.println("Are you grumpy? " + leave.isGrumpy());
        // Does not compile if isGrumpy() is defined as private!
    }
}

// private class LeaveMeAlone // Does not compile! Classes and interfaces can't be private!
class LeaveMeAlone //
{
    // But we can define all members of this class as private!
    // Only, this will make this class quite useless.
    private boolean grumpy = true;

    boolean isGrumpy() {
        return grumpy;
    }
}
