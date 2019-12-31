package Task_2_2.Task2_1;

public class Task2_1 {
    public static void main(String[] args) {
        String[] str_Arr = new String[2];
        for (int i = 0; i < str_Arr.length; i++) {
            System.out.print(" Введите " + (i + 1) + " слово ");
            str_Arr[i] = Other.Scann.Scan();
        }
        boolean bool = false;
        if (bool = Bool(str_Arr))
            Other.Scann.Print("Отлично! Слова одинаковы");
        else if (bool = Bool_(str_Arr))
            Other.Scann.Print("Хорошо. Почти одинаковы");
        else if (bool = Bool_1(str_Arr))
            Other.Scann.Print("Ну, хотя бы они одной длины");
        else Other.Scann.Print("Слова разные");
    }

    static boolean Bool(String[] str_Arr) {
        boolean bool = false;
        if (str_Arr[0].equals(str_Arr[1])) {
            bool = true;
        }
        return bool;
    }

    static boolean Bool_(String[] str_Arr) {
        boolean bool = false;
        if (str_Arr[0].equalsIgnoreCase(str_Arr[1])) {
            bool = true;
        }
        return bool;
    }

    static boolean Bool_1(String[] str_Arr) {
        boolean bool = false;
        if (str_Arr[0].length() == str_Arr[1].length()) {
            bool = true;
        }
        return bool;
    }
}
