/*
This classes deals with hiding methods when inheriting classes.
*/
abstract class AbstractClass {
    public void publicMethod() {
        System.out.println("publicMethod defined in AbstractClass");
    }

    /*
    This method is private
    */
    private void privateMethod() {
        System.out.println("privateMethod defined in AbstractClass");
    }

    static void staticMethod() {
        System.out.println("staticMethod defined in AbstractClass");
    }


    // Main:
    public static void main(String[] args) {
        AbstractClass abstr = new ExtendedClass();
        abstr.publicMethod();
        // >> publicMethod defined in ExtendedClass
        abstr.privateMethod();
        // >> privateMethod defined in AbstractClass
        abstr.staticMethod();
        // >> staticMethod defined in AbstractClass
        /*
        This example uses AbstractClass as the reference type which is a superclass of ExtendedClass.

        Of all the methods, only publicMethod() is correctly overridden. So only its definition from the ExtendedClass is used.
        */
        AbstractClass.staticMethod();
        // >> staticMethod defined in AbstractClass


        System.out.println();

        ExtendedClass ext = (ExtendedClass) abstr; // Here, we cast abstr to its original Class
        ext.publicMethod();
        // >> publicMethod defined in ExtendedClass
        ext.privateMethod();
        // >> privateMethod defined in ExtendedClass
        ext.staticMethod();
        // >> staticMethod defined in ExtendedClass


        ExtendedClass.staticMethod();
        // >> staticMethod defined in ExtendedClass

    }

}

class ExtendedClass extends AbstractClass {

    /*
    This is a valid override of publicMethod() because both are public.
    */
    public void publicMethod() {
        System.out.println("publicMethod defined in ExtendedClass");
    }

    /*
    This is not an override! privateMethod() is definded as private in AbstractClass, so class extensions can't possibly know about it. So by defining its own privateMethod(), ExtendedClass hides the function.
    But hidden functions can be accessed with an apporpriate reference type!
    */
    void privateMethod() {
        System.out.println("privateMethod defined in ExtendedClass");
    }

    /*
    This is not an override! static methods cannot be overriden but are hidden instead.
    */
    static void staticMethod() {
        System.out.println("staticMethod defined in ExtendedClass");
    }

}
