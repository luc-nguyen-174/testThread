public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        Thread t1 = new Thread(){
            public void run() {
                mt.myThread(1,10);
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                mt.myThread(0,15);
            }
        };
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}