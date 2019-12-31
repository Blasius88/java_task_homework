package Task_3_1.Task3_2;

import Task_3_1.Task3_1.Task3_1;

public class Task3_2 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите размер массива ");
            int a = Integer.parseInt(Other.Scann.Scan());
            int[] arr = Task3_1.Arr(a);
            System.out.print("Исходный массив ");
            System.out.print(Task3_1.Str(arr) + "\n");
            arr = NewArr(arr);
            System.out.print(Task3_1.Str(arr) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int[] NewArr(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean bool = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (temp != arr[j]) {
                    bool = true;
                } else break;
            }
            if (bool)
                count++;
        }

        System.out.println(count);
        int[] arr1 = new int[count];
        count = 0;
        int temp_;
        for (int i = 0; i < arr.length; i++) {
            temp_ = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp_ != arr[j]) {
                    arr1[count] = arr[j];
                    count++;
                } else break;
            }
        }
        return arr1;
    }
}
