package Other;

import java.util.Random;
import java.util.Scanner;


public class Scann {
    //Водд данных вручную
    public static String Scan() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }

    //печать строки
    public static void Print(String str) {
        System.out.println(str);
    }

    //Массив ввод ручкой
    public static int[] Arr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива ");
            arr[i] = Integer.parseInt(Scan());
        }
        return arr;
    }

    // рандомный массив
    public static int[] ArrRand(int a) {
        Random rand = new Random();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print((i + 1) + " элемент массива: " + arr[i] + "\n");
        }
        return arr;
    }

    //Двухмерный массив  ввод данных
    public static int[][] Arr(int a, int b) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Введите [" + (i + 1) + "][" + (j + 1) + "] элемент массива ");
                arr[i][j] = Integer.parseInt(Scan());
            }
        }
        return arr;
    }

    //Печать массива в строку
    public static String Str(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++)
            str += arr[i];
        return str;
    }

    // Печать массива на экран
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Печать двухмерного массива на экран
    public static void Print(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j <arr.length; j++)
                System.out.print(arr[i][j] + " ");
    }


}
