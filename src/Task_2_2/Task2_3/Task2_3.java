package Task_2_2.Task2_3;

public class Task2_3 {
    public static void main(String[] args) {
        System.out.print("Введите год ");
        int year = Integer.parseInt(Other.Scann.Scan());
        boolean bool = Bool(year);
        if (bool) {
            System.out.println("год высокосный");
        } else System.out.println("год не высокосный");
    }

    static boolean Bool(int a) {
        boolean bool = false;
        if (a %4 == 0 && a % 100 != 100 || a % 400 == 0)
            bool = true;
        return bool;
    }
}
