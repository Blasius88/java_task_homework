package Task7;

import Task7.Enemy.Zomby;
import Task7.Hero.Warrior;

public class Scenario {
    static boolean bool = false;
    static boolean zomby_bool = false;


    static int Hi(String name) {
        System.out.print("Приветсвую тебя юный гладиатор " + name + ". ");
        int a = Enemy_Choice();
        return a;
    }

    static int Enemy_Choice() {
        System.out.print("Выбери своего врага:\n" +
                "1 - Зомби\n" +
                "2 - Оборотни\n" +
                "3 - Вампиры\n" +
                "Ну же сделай свой выбор: ");
        int a = Integer.parseInt(Other.Scann.Scan());
        return a;
    }

    public static void Scenario(String name) {
        int a;
        if (!bool) {
            a = Hi(name);
        } else
            a = Enemy_Choice();
        switch (a) {
            case 1:
                String enemy = "Зомби";
                Good(enemy);
                Zomby.zomby.health = 1000;
                zomby_bool = true;
                Fight();
                break;
            case 2:
                enemy = "Оборотни";
                Good(enemy);
                break;
            case 3:
                enemy = "Вампиры";
                Good(enemy);
                break;
            default:
                System.out.println("вы не выбрали противника");
                bool = true;
                Scenario(name);
        }
    }

    static void Good(String name) {
        System.out.println(name + ", отличный выбор !!!");
    }

    static void Fight() {
        boolean finisch = false;
        if (zomby_bool) {
            while (!finisch) {
                int attack = Warrior.warrior.getDamage();
                Zomby.zomby.health -= attack;
                if (Zomby.zomby.health <= 0) {
                    Zomby.zomby.getHealth();
                    if (Zomby.zomby.health <= 0) {
                        System.out.println("зомби умер");
                        break;
                    }
                }
                System.out.println("\nЗдоровье у зомби осталось: " + Zomby.zomby.health);
                Warrior.warrior.health-=Zomby.zomby.damage;
            }
        }
    }

}
