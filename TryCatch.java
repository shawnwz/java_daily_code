public class TryCatch {

    public static String testExceptions() {
        String result = "";
        String v = null;
   
        try {
           try {
               result += "a";
               v.length();
               result += "b";
           } catch (NullPointerException e) {
               result += "c";
               throw new RuntimeException();
           } 
           finally {
               result += "d";
           }
       } catch (Exception e) {
           result += "e";
       }
       result += "f";
       return result;
    }
   
   
   
    public static void main(String[] args) {
   
   
       String result = TryCatch.testExceptions();
       System.out.println(result);
   
      }
   }

   /*
   Initially, the result variable is empty string. It then appends “a”. Next, while trying to execute “v.length()”, it gets a null pointer exception and is caught by the first catch block and “c” is appended to the result variable. Next, compiler executes “throw new RuntimeException();” line and another exception is caught. However, before that sequence the finally block executes and “d” is appended to the result beforehand. After catching the second exception an “e” gets appended and then finally “f”. The key to this question is to remember that the finally block always gets executed after the try-catch statement.
   */