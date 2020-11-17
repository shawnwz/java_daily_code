import java.io.*;
import java.util.Hashtable;

public class KeyFlip {

    Hashtable h = new Hashtable();
    Hashtable v = new Hashtable();
    Hashtable s = new Hashtable();
    public KeyFlip(Hashtable htable, Hashtable vtable, Hashtable stable) {


        this.h = htable;
        this.v = vtable;
        this.s = stable;

    }

    public String vflip(Hashtable table, String s){
        if (table.contains(s)){
            return table.get(s).toString();
        }else{
            return s;
        }
    }
    String hflip(Hashtable table, String s){
        if (table.contains(s)){
            return table.get(s).toString();
        }else {
            return s;
        }
    }
    String shift(Hashtable table, String s, int offset){

        return s;
    }

    public static void main(String[] args) throws IOException {

        Hashtable<String, String> htable = new Hashtable<String, String>();
        htable.put("1", "0");
        htable.put("2", "9");
        htable.put("3", "8");
        htable.put("4", "7");
        htable.put("5", "6");
        htable.put("6", "5");
        htable.put("7", "4");
        htable.put("8", "3");
        htable.put("9", "2");
        htable.put("0", "1");

        htable.put("q", "p");
        htable.put("w", "o");
        htable.put("e", "i");
        htable.put("r", "u");
        htable.put("t", "y");
        htable.put("y", "t");
        htable.put("u", "r");
        htable.put("i", "e");
        htable.put("o", "w");
        htable.put("p", "q");

        htable.put("a", "'");
        htable.put("s", ";");
        htable.put("d", "l");
        htable.put("f", "k");
        htable.put("g", "j");
        htable.put("h", "h");
        htable.put("j", "g");
        htable.put("k", "f");
        htable.put("l", "d");
        htable.put(";", "s");
        htable.put("'", "a");
        //TODO



        Hashtable<String, String> vtable = new Hashtable<String, String>();
        vtable.put("1", "z");
        vtable.put("q", "a");
        vtable.put("a", "q");
        vtable.put("z", "1");
        //TODO

        Hashtable<Integer, String> stable = new Hashtable<Integer, String>();
        stable.put(1, "1");
        stable.put(2, "2");
        stable.put(3, "3");
        stable.put(4, "4");
        stable.put(5, "5");
        stable.put(6, "6");
        stable.put(7, "7");
        stable.put(8, "8");
        stable.put(9, "9");
        stable.put(10, "0");
        stable.put(11, "q");
        stable.put(12, "w");
        stable.put(13, "e");
        stable.put(14, "r");
        stable.put(15, "t");
        stable.put(16, "y");
        stable.put(17, "u");
        stable.put(18, "i");
        stable.put(19, "o");
        stable.put(20, "p");
        stable.put(21, "a");
        //TODO

        KeyFlip keyFlip = new KeyFlip(htable, vtable, stable);

        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        String transformation = "H,V,85,V";


        while ((s = br.readLine()) !=null) {
            String[] t = transformation.split(",");
            StringBuilder sb = new StringBuilder();
            String temp="";
            for (int i=0; i< s.length(); i++){
                for (int j=0; j<t.length; j++){

                    if(t[j].equalsIgnoreCase("V")) {
                        temp = keyFlip.vflip( keyFlip.v, String.valueOf(s.charAt(i)));
                    } else if (t[j].equalsIgnoreCase("H")) {
                        temp = (keyFlip.vflip( keyFlip.h, temp));
                    } else {
                        temp = keyFlip.shift( keyFlip.s, temp, Integer.valueOf(t[j]));
                    }
                }
                sb.append(temp);
                temp="";

            }
            System.out.println(sb.toString());

        }

    }

}

