package Task_2_1.Task2_3;


public class Task2_3 {
    public static void main(String[] args) {
        System.out.print("Введите a ");
        int a = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Введите b ");
        int b = Integer.parseInt(Other.Scann.Scan());
        System.out.print("Введите c ");
        int c = Integer.parseInt(Other.Scann.Scan());
        Quadratic_equation(a, b, c);
        discriminant(a, b, c);
    }

    static void Quadratic_equation(int a, int b, int c) {
        int x = (int) (-b + -Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        String str = "корни квадратного уравнения = " + x;
        Other.Scann.Print(str);
        if (isPositive(x)) Other.Scann.Print(" корень квадратного уравнения положительный");
        else Other.Scann.Print(" корень квадратного уравнения отрицательный");
        if (isZero(x)) Other.Scann.Print(" корень квадратного уравнения чило равно нулю");
        else Other.Scann.Print(" корень квадратного уравнения не равен нулю");
    }

    static boolean isPositive(int a) {
        boolean bool = false;
        if (a > 0)
            return bool = true;
        return bool;
    }

    static boolean isZero(int a) {
        boolean bool = false;
        if (a == 0)
            return bool = true;
        return bool;
    }

    static void discriminant(int a, int b, int c) {
        int x = (int) (Math.pow(b, 2) + 4 * a * c);
        if (x < 0) {
            Other.Scann.Print("Дискриминант отрицательный");
        }
        String str = "Дискриминант = " + x;
        Other.Scann.Print(str);
    }
}
