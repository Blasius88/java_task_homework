package Schild.Thread;

public class MyThread implements Runnable {
    Thread thread;

    MyThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        System.out.println(thread.getName() + "- run");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("In " + thread.getName() + ", count: " + i);
            }
        } catch (Exception ex) {
            System.out.println(thread.getName() + " - break");
        }

        System.out.println("The end");
    }
}
