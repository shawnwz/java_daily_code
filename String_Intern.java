public class String_Intern {
    public static void main(String[] args){
        String str1 = new StringBuilder("java").append("虚拟机").toString();
        System.out.println(str1.intern()==str1);  //true
        String str2 = new String("我喜欢JAVA");
        System.out.println(str2==str2.intern());  //false
    }
}

/*
str1指向的实例是在堆中，是由“java”和"虚拟机"拼接成的。执行完第一句代码后，执行完这句话后，常量池中会有"java"和"虚拟机"，但是不会有"java虚拟机"。然后使用str1.intern（）会在常量池中保存str1实例的引用，并且返回引用，因此str1.intern()==str1。
而执行完String str2=new String("我喜欢java");后，常量池中会有"我喜欢java"，所以在使用str2.intern（）返回的就是字符串常量池中的引用，而str2指向的是堆中的引用，因此str2！=str2.intern()。
intern() 方法返回字符串对象的规范化表示形式。

它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
*/