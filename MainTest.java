//the sequence of class constructor and static  method

public class MainTest {
    private int field = initializeField();
    private static int staticField = initializaStaticField();
    private int finalField = initializeFinalField();

    MainTest(){
        System.out.println("constructor");
    }

    {
        System.out.println("initialization block 2");
    }

    public static void main(String[] args){
        System.out.println("main");
        new MainTest();
    }

    private static int initializeFinalField() {
        System.out.println("final field");
        return 0;
    }

    private static int initializeField() {
        System.out.print("field");
        return 0;
    }

    private static int initializaStaticField() {
        System.out.println("static field");
        return 0;
    }
}
