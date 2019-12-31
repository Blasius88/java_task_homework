package Task_3_2.Task3_9;


import java.util.Random;

public class Task3_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Число: " + number);
        boolean isComposite = false;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isComposite = true;
                break;
            }
        }
        if (isComposite)
        {
            System.out.println("Число составное");
        }
        else
        {
            System.out.println("Число простое");
        }
    }
}
