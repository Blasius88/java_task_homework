package Task7.Enemy;

import java.util.Random;

public class Zomby extends Enemy {
    public Zomby() {
    }

    public static Zomby zomby = new Zomby();

    public Zomby(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public int getDamage() {
        this.damage = 150;
        return super.getDamage();
    }


    @Override
    public int getHealth() {
        if (isAlive()) {
            Random random = new Random();
            int a = 1 + (int) (Math.random() * 99);
            if (a < 20) {
                this.health = 990;
            }
        }
        return super.getHealth();
    }
}
