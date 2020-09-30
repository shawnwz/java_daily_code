public class NumberPromo {
   public static void main(String[] args){
       byte b = -1;
       switch (b & 0xff){
           case -1:
            System.out.println("-1");
            break;
        case 0:
            System.out.println("0");
            break;
        case 255:
            System.out.println("255");
            break;
        case 256:
            System.out.println("256");
            break;
        case 65535:
            System.out.println(65535);
            break;

       }
   } 
}
//b gets extended to int (0xffffffff). 0xff is an int value (0x0000000ff). The result of the logical AND operation is 0x000000ff = 255. 255 is equal to 255.
