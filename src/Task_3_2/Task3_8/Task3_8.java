package Task_3_2.Task3_8;

import Task_3_2.Task3_7.Task3_7;

public class Task3_8 {
    public static void main(String[] args) {
        int counter = 0;
        String cardFull = "";
        while (counter < 53) {
            String[] strings = cardFull.split("|");
            String card = Task3_7.Num_Card();
            card += Task3_7.Lear();
            card += "|";
            boolean flag = false;
            for (int i = 0; i < strings.length; i++) {
                String part1 = strings[i];
                if (part1 != card) {
                    flag = true;
                }
            }
            if (flag) {
                cardFull += card;
                counter++;
            }
        }
        System.out.println(cardFull);
        System.out.println("Колода разложена");
    }
}

