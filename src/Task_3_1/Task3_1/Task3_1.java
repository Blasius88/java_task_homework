package Task_3_1.Task3_1;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.print("Введите длинну массива ");
        int a = Integer.parseInt(Other.Scann.Scan());
        int[] arr = Arr(a);
        System.out.print("Исходный массив ");
        System.out.print(Str(arr) +"\n");
        System.out.print("Введите количество циклов ");
        int b = Integer.parseInt(Other.Scann.Scan());
        for (int i = 0; i < b; i++) {
            arr = Cycle(arr);
            System.out.println(Str(arr));
        }
    }

    public static int[] Arr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введиете " + (i +1) + " элемент массива ");
            arr[i] = Integer.parseInt(Other.Scann.Scan());
        }
        return arr;
    }

    static int [] Cycle(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static String Str (int [] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i ++)
            str += arr[i];
        return str;
    }
}
