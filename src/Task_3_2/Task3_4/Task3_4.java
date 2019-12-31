package Task_3_2.Task3_4;

import java.util.Random;

public class Task3_4 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (10 + Math.random() * 89);
            System.out.print(arr[i] + " ");
        }
        if (arr[0] < arr[1] && arr[1] < arr[2]) {
            System.out.println("Массив строго возрастающий");
        } else {
            System.out.println("Массив не возрастающий");
        }
    }
}
