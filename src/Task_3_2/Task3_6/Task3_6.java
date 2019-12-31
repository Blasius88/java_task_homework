package Task_3_2.Task3_6;

public class Task3_6 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        int a = Integer.parseInt(Other.Scann.Scan());
        System.out.println("Введите высату массива");
        int b = Integer.parseInt(Other.Scann.Scan());
        System.out.println("Введите элементы 1 массива");
        int[][] arr_1 = Other.Scann.Arr(a, b);
        System.out.println("Введите элементы 2 массива");
        int[][] arr_2 = Other.Scann.Arr(a, b);
        Other.Scann.Print(arr_1);
        System.out.print("- 1 массив\n");
        Other.Scann.Print(arr_2);
        System.out.print("- 2 массив\n");
        boolean bool = Bool(arr_1, arr_2, a, b);
        if (bool) {
            System.out.println("Массивы равны ");
        } else {
            System.out.println("Массивы не равны");
        }
    }


    static boolean Bool(int[][] arr1, int[][] arr2, int a, int b) {
        boolean bool = false;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr1.equals(arr2)) {
                    bool = true;
                } else break;
            }
        }
        return bool;
    }
}
