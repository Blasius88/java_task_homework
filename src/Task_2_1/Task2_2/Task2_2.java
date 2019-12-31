package Task_2_1.Task2_2;

/*
Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
Проверить, помещаются ли эти дома на участке размерами e на f.
Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
*/

public class Task2_2 {
    public static void main(String[] args) {
        System.out.print("Enter a ");
        int a = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Enter b ");
        int b = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Enter c ");
        int c = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Enter d ");
        int d = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Enter e ");
        int e = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Enter f ");
        int f = Integer.parseInt(Other.Scann.Scan());
        boolean[] bool_arr = new boolean[2];
        for (int i = 0; i < bool_arr.length; i++) {
            if (i == 0)
                bool_arr[i] = Bool(a, b, e, f);
            else
                bool_arr[i] = Bool(c, d, e, f);
        }
        for (int i = 0; i < bool_arr.length; i++) {
            if (bool_arr[i] == true) {
                Other.Scann.Print("дом " + (i + 1) + " помищается в выделенный участок");
            } else
                Other.Scann.Print("дом " + (i + 1) + " не помищается в выделенный участок");
        }
    }

    static boolean Bool(int a, int b, int c, int d) {
        boolean bool = false;
        if ((a <= c && b <= d) || (a <= d && b <= c)) {
            bool = true;
        }
        return bool;
    }
}
