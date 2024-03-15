public class StaticBlock {
    static int a = 5;
    static int b;
// will run only once when the first object is created, when the class is loaded for the first time
    static {
        System.out.println("i am a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}
