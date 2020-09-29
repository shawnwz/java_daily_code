//This throw concurrent modification exception
import java.util.ArrayList;
import java.util.Arrays;

public class ConcurrentModificationException {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("aa","bb","cc","dd"));
        for (String value:list) {
            if ("bb".contentEquals(value)) {
                list.remove(value);
            }
            System.out.println("value:"+value);
        }
    
    }
}
