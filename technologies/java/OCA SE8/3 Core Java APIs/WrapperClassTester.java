public class WrapperClassTester {
    public static void main(String[] args) {
        int num1 = 42;
        Integer num2 = 43;
        int num3 = new Integer(44);
        num2.valueOf(4);
        num2.parseInt("123");
        int num4 = Integer.valueOf("032");
        Integer num5 = Integer.valueOf("33");

        int num6 = Integer.parseInt("34");
        Integer num7 = Integer.parseInt("35");

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num2.parseInt("123"));
    }
}
