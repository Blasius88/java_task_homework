package Task_3_2.Task3_1;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива ");
        int a = Integer.parseInt(Other.Scann.Scan());
        int[] arr = Other.Scann.Arr(a);
        Print(arr);
        System.out.print("\n");
        Print1(arr);
    }

    static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Print1(int[] arr) {
        for (int i = arr.length -1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
