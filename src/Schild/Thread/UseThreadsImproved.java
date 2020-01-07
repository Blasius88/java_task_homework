package Schild.Thread;

public class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Run master thread");
        MyThread thread = new MyThread("Child #1");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                System.out.println("Break master thread");
            }
            System.out.println("The end master thread");
        }

    }
}
