package Task_3_1.Task3_3;

public class Task3_3 {
    public static void main(String[] args) {
        System.out.print("Введите длину 1 массива: ");
        int a = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Введите длину 2 массива: ");
        int b = Integer.parseInt(Other.Scann.Scan());
        int[] arr = Other.Scann.Arr(a);
        int[] arr1 = Other.Scann.Arr(b);
        int[] arr2 = Union(arr, arr1);
        System.out.println(Other.Scann.Str(arr2));;
    }


    static int[] Union(int[] arr, int[] arr1) {
        int[] arr2 = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0, j = arr.length; i < arr1.length; i++, j++) {
            arr2[j] = arr1[i];
        }
        return arr2;
    }
}

