package Schild.MoreThread;

public class MoreThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        MyThread thread1 = new MyThread("Child #1");
        MyThread thread2 = new MyThread("Child #2");
        MyThread thread3 = new MyThread("Child #3");
        MyThread thread4 = new MyThread("Child #4");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                System.out.println("- прерывание осмновного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
