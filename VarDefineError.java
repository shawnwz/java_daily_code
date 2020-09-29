// can not define var with the same name in different CASE clauses;
public class VarDefineError {
    public static void main(String[] args) {
        String key = "1";
        switch (key) {
            case "1":
                int i  =1;
                System.out.println(i);
                break;
            case "2":
                int i = 2;   //error: variable i is already defined in method main(String[])
                System.out.println(i);
                break;
        }
    }
}
