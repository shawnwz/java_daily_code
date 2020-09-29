public class ConstructorSeq {

    String str = "c";

    { str += "d"; }
    {str += "z";}

    public ConstructorSeq() {
       this("a");
       str += "b";
     }
   
    public ConstructorSeq(String s) {
       str += s;
     }

    { str += "e"; }
    public static void main(String[] args) {
        ConstructorSeq t = new ConstructorSeq();
       System.out.println(t.str);
     }
   }