package Task_4_2.Task4_2;

public class Bank {
    public int Banknota20;
    public int Banknota50;
    public int Banknota100;

    public int getBanknota20() {
        return Banknota20;
    }

    public int getBanknota50() {
        return Banknota50;
    }

    public int getBanknota100() {
        return Banknota100;
    }

    public void setBanknota20(int banknota20) {
        Banknota20 = banknota20;
    }

    public void setBanknota50(int banknota50) {
        Banknota50 = banknota50;
    }

    public void setBanknota100(int banknota100) {
        Banknota100 = banknota100;
    }

    public Bank() {
    }

    public Bank(int banknota20) {
        this.Banknota20 = banknota20;
    }

    public Bank(int banknota20, int banknota50) {
        this.Banknota20 = banknota20;
        this.Banknota50 = banknota50;
    }

    public Bank(int banknota20, int banknota50, int banknota100) {
        this.Banknota20 = banknota20;
        this.Banknota50 = banknota50;
        this.Banknota100 = banknota100;
    }
}
