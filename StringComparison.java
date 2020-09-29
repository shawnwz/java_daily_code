public class StringComparison {
    public static void main(String[] args){
        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        String s4 = new String("hello world");
        String s5 = s4;
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s5==s4); //true
    }
    
}

/*
s1 == s2 because they are String literals, both pointing to the same value in the String pool
s1 != s3 because s3 points to a new object on the heap
s3 != s4 because they point to two different objects on the heap
s4 == s5 because the references point to the same object on the heap
*/