package Task_3_2.Task3_7;

public class Task3_7 {
    public static void main(String[] args) {
        String card = Num_Card ();
        card += Lear();
        System.out.println("Ваша карта: " + card);
    }
    public static String Num_Card ()
    {
        String str ="";
        int num_card = (int) (2 + Math.random() *12);
        if (num_card == 11) {
            str += "Jack";
        } else if (num_card == 12) {
            str += "Queen";
        } else if (num_card == 13) {
            str += "King";
        } else if (num_card == 14) {
            str += "Ace";
        } else str = String.valueOf(num_card);
        return str;
    }

    public static String Lear ()
    {
        int lear = (int) (1 + Math.random()*3);
        String str ="";
        if (lear == 1) {
            str += " of Heats";
        } else if (lear == 2) {
            str += " of Spades";
        } else if (lear == 3) {
            str += " of Clubs";
        } else {
            str += " of Diamonds";
        }
        return str;
    }
}
