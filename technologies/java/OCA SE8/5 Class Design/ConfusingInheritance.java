public class ConfusingInheritance {
    public ConfusingInheritance(){
        System.out.println("Cnstruct ConfusingInheritance without parameter");
    }
    public ConfusingInheritance(int n){
        System.out.println("Construct ConfusingInheritance with int parameter:" + n);
    }
    private boolean isConfused(){
        return false;
    }

    public static void main(String[] args){
        ConfusingInheritance confusedchild1 = new ConfusedChild(42);  // Note the type (class) of this reference
        System.out.println("; " + confusedchild1.isConfused());

        ConfusedChild confusedchild2 = (ConfusedChild) confusedchild1; // Now the reference is the same as the actual object class
        System.out.println("this time?: " + confusedchild2.isConfused());
    }
}

class ConfusedChild extends ConfusingInheritance {
    public ConfusedChild(int n){
        // super(n);
        System.out.println("Construct ConfusedChild with int parameter: " + n);
    }
    public boolean isConfused(){
        return true;
    }
}
