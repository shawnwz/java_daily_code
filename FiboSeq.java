public class FiboSeq {

    public static void main(String[] args) {
        int x = 20;
        System.out.println(fun(x));
    }

    private static int fun(int n) {
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }

        return fun(n-1) + fun(n-2);
    }
}
