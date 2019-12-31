package Task_2_1.Task2_1;

import Other.Scann;
/*Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.*/


public class Task2_1 {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Введите день");
        int day = Integer.parseInt(Scann.Scan());
        System.out.println("Введите месяц");
        String month = Scann.Scan();
        System.out.println("Введите год");
        int year = Integer.parseInt(Scann.Scan());
        String str = FormationString(day, month, year);
        Scann.Print(str);
    }

    public static String FormationString(int a, String str, int b) {

        String str1 = "";
        boolean bool = Bool(a, str, b);
        if (bool) {
            str1 = a + "/" + str + "/" + b;
            return str1;
        } else start();
        return str1;
    }

    static boolean Bool(int a, String str, int b) {
        boolean bool = false;
        int c = Integer.parseInt(str);
        if (b % 4 == 0 && b % 100 != 0 || b % 400 == 0) {
            if (c == 2) {
                if (a > 29) {
                    System.out.println("Произошла ошибка");
                } else bool = true;
            } else {
                if (a > 30) {
                    if (c == 1 || c == 3 || c == 5 || c == 7 || c == 8 || c == 10 || c == 12) {
                        if (a < 32) {
                            bool = true;
                        }
                    }
                }
                else bool = true;
            }

        } else {
            if (c == 2) {
                if (a > 28) {
                    System.out.println("Произошла ошибка");
                } else bool = true;
            } else {
                if (a > 30) {
                    if (c == 1 || c == 3 || c == 5 || c == 7 || c == 8 || c == 10 || c == 12) {
                        if (a < 32) {
                            bool = true;
                        }
                    }
                }
                else bool = true;
            }
        }
        return bool;
    }
}
