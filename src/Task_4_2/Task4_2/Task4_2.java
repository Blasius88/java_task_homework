package Task_4_2.Task4_2;

public class Task4_2 {
    public static int banknot100 = 0;
    public static int banknot50 = 0;
    public static int banknot20 = 0;
    static Bank bank = new Bank();

    public static void main(String[] args) {
        bank.Banknota20 = 100;
        bank.Banknota50 = 100;
        bank.Banknota100 = 100;
        Receive();
    }

    static void Receive() {
        System.out.print("Введите сумму: ");
        int sum = Integer.parseInt(Other.Scann.Scan());
        if (sum < 20 || sum % 10 != 0) {
            Print("Таких купюр нет в банкомате");
        } else {
            Receive(sum);
        }
    }

    static void Print(String str) {
        System.out.println(str);
    }

    static void Receive(int sum) {
        boolean bool = false;
        while (sum != 0) {
            if (sum > 99 && bank.Banknota100 != 0) {
                sum = Receive100(sum);
            } else if (sum > 49 && bank.Banknota50 != 0) {
                sum = Receive50(sum);
            } else if (sum > 19 && bank.Banknota20 != 0) {
                sum = Receive20(sum);
            } else if (bank.Banknota20 == 0) {
                Print("Деньги закончились в банкамате ");
                break;
            } else if (sum < 20 && sum > 0) {
                break;
            }
            if (sum == 0) {
                bool = true;
            }
        }
        if (bool)
            Print("банкнот 100: " + banknot100 + "\n"
                    + "банкнот 50: " + banknot50 + "\n"
                    + "банкнот 20: " + banknot20 + "\n");
        else
            Print("Такую сумму не возможности выдать ");

    }


    static int Receive100(int sum) {
        bank.Banknota100--;
        banknot100++;
        sum -= 100;
        return sum;
    }

    static int Receive50(int sum) {
        banknot50++;
        bank.Banknota50--;
        sum -= 50;
        return sum;
    }

    static int Receive20(int sum) {
        bank.Banknota20--;
        banknot20++;
        sum -= 20;
        return sum;
    }


}
