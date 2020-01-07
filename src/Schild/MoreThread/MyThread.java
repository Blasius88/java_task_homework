package Schild.MoreThread;

public class MyThread implements Runnable{
    Thread thread;
    MyThread(String name)
    {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run ()
    {
        System.out.println(thread.getName() + " - запуск");
        try {
            for (int i = 0; i < 10; i ++)
            {
                Thread.sleep(400);
                System.out.println("В " + thread.getName() + ", счетчик " + i);

            }
        }
        catch (Exception ex)
        {
            System.out.println(thread.getName() + " -прерван");
        }
        System.out.println(thread.getName() + " - завершение");

    }
}
