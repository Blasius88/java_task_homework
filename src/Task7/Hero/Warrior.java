package Task7.Hero;

import Task7.Scenario;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior() {
    }

    public static Warrior warrior = new Warrior();

    public Warrior(String n, int damage, int health, int experience) {
        this.name = n;
        this.health = health;
        this.damage = damage;
        this.experience = experience;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getDamage() {
        Random random = new Random();
        System.out.println("Выберите способ атаки:\n" +
                "1 - обычная атака\n" +
                "2 - супер атака\n" +
                "3 - сбежать с поля боя");
        int a = Integer.parseInt(Other.Scann.Scan());
        switch (a){
            case 1:
                this.damage = 150;
                System.out.println("Выш герой нанес урон " + damage);
                break;
            case 2:
                this.damage = 150+10 *(int)(Math.random()*99);
                System.out.println("Выш герой нанес урон " + damage);
                break;
            case 3:
                Scenario.Scenario(name);
                break;
            default:
                getDamage();
        }
        return super.getDamage();
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void setExperience(int experience) {
        super.setExperience(experience);
    }
}
