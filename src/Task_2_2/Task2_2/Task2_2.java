package Task_2_2.Task2_2;

public class Task2_2 {
    public static void main(String[] args) {
        System.out.print("Ведите сумму ");
        int a = Integer.parseInt(Other.Scann.Scan());
        IfElse(a);
        Switch(a);
    }


    static void IfElse(int a) {
        if (a == 1 || a == 21)
            System.out.println(a + "рубль");
        if ((a > 1 && a < 5) || (a > 21 && a < 25))
            System.out.println(a + "рубля");
        if ((a > 4 && a < 21) || (a > 24 && a < 31))
            System.out.println(a + "рублей");
    }

    static void Switch(int a) {
        switch (a) {
            case 1:
                System.out.println(a + "рубль");
                break;
            case 2:
                System.out.println(a + "рубля");
                break;
            case 3:
                System.out.println(a + "рубля");
                break;
            case 4:
                System.out.println(a + "рубля");
                break;
            case 5:
                System.out.println(a + "рублей");
                break;
            case 6:
                System.out.println(a + "рублей");
                break;
            case 7:
                System.out.println(a + "рублей");
                break;
            case 8:
                System.out.println(a + "рублей");
                break;
            case 10:
                System.out.println(a + "рублей");
                break;
        }
    }
}
