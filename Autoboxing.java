public class Autoboxing {

    public void print(Object o){
        System.out.println("object");
    }
    public void print(Integer i){
        System.out.println("integer");
    }
    public void print(long l){
        System.out.println("long");
    }

    public static void main(String[] args){
        Autoboxing a = new Autoboxing();
        a.print(3);
        a.print(Long.valueOf(3));
    }
    
}

/*
o.print(3); - there is no method having signature print(int), so the Java compiler performs widening to long (widening has priority over autoboxing)
o.print(Long.valueOf(3)); - there is no method having signature print(Long), so the Java compiler performs upcasting of Long to Object (not Integer, because Long does not extend Integer class)
*/
