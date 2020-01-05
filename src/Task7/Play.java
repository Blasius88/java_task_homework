package Task7;

import Task7.Hero.Warrior;

public class Play {
    public static void main(String[] args) {
        Play();
    }

    static void Play() {
        System.out.print("1 - Воин\n" +
                "2 - Лучник\n" +
                "3 - Маг\n" +
                "Выберите класс героя: ");
        int a = Integer.parseInt(Other.Scann.Scan());
        switch (a) {
            case 1:
                Warrior.warrior.name = Name();
                Warrior.warrior.health = 1500;
                Warrior.warrior.experience = 0;
                Scenario.Scenario(Warrior.warrior.name);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Ввели неверное значение");
                Play();
        }
    }

    static String Name() {
        System.out.print("Веедите имя героя: ");
        String str = Other.Scann.Scan();
        return str;
    }
}
