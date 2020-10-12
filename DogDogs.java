import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DogDogs {

    private static String swapDog1(String text) {
        Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, "dogs");
        }
        matcher.appendTail(result);
        return result.toString();
    }

    private static String swapDog2(String text){
        return text.replaceAll("dog", "dogs");
    }

    private static String swapDog3(String text){
        Pattern pattern = Pattern.compile("(dog)");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(result, matcher.group(1) + "s");
        }
        matcher.appendTail(result);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(swapDog3("dog dog dogs dogs"));
    }
    
}
