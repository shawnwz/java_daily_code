import java.util.Stack;

public class RevertWords {

    public static void main(String[] args) {
        String ss = "This is a good example, this is a bad example ? ";
        System.out.println(reverseWords(ss));
    }

    private static String reverseWords(String ss) {
        Stack stack = new Stack();

        String temp = "";

        for (int i=0; i<ss.length(); i++) {
            if (ss.charAt(i) != ' '){
                temp += ss.charAt(i);
            }
            else if(temp != ""){
                stack.push(temp);
                temp="";
            } else {
                continue;
            }
        }
        if (temp!=""){
            stack.push(temp);
        }
        String result = "";
        while (!stack.isEmpty()){
            result += stack.pop() + " ";
        }
        return result.substring(0, result.length() - 1);
    }
}
