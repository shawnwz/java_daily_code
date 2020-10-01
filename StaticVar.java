public class StaticVar {
    public static void main(String[] args){
        TestSubClass t1 = new TestSubClass();
        TestSubClass t2 = new TestSubClass();

        t1.a = 100;
        t1.b = 200;

        t2.a = 300;
        t2.b = 400;

        System.out.println(t1.a + t2.a);
        System.out.println(t1.b + t2.b);
    }
}

class TestSubClass{
    int a;
    static int b;
}
/*
Variable named “a” is an instance variable when you create an object it has a default value of 0 because of int. Then it has a value 100 for object t1 and has a value 300 for object t2. So when you add it you get 400.
Variable named “b” is a class variable not an instance variable. So when you use that class (TestSubClass) first of all it gets a value of 200 and then it gets 400 that means for both object it gets same value. So when you add them together you see 800.
*/