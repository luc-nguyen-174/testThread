public class MyThread {
    void myThread(int n1, int n2) {
        for (int i = n1; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(n2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
