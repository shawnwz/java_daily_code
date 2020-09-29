//This return 2^n for a given cap
//HashMap extend capacity algorithm

public class TableSize {
    static final int MAXIMUM_CAPACITY = 1 << 30;
    private int tableSizefor(int cap){
        int n = cap -1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n<0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main (String[] args) {
        TableSize t = new TableSize();
        System.out.println(t.MAXIMUM_CAPACITY);
        System.out.println(t.tableSizefor(0));
    } 
    
}
