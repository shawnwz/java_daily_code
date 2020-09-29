public class TestThread extends Thread {
    
    @Override
    public void run() {
        run1();
        run2();
    }

    public synchronized void run1(){
        try{
            for (int i = 1; i<=3; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        }catch(Exception i){
            System.out.println("Interrupted Exception");
        }
    }

    public synchronized void run2(){
        try{
            for (int i = 4; i<=6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        }catch(Exception i){
            System.out.println("Interrupted Exception");
        }
    }

    public static void main(String[] args){
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
    }

}
