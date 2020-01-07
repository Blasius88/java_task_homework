package Task7.Enemy;

import Task7.Hero.isAlive;

public class Enemy implements isAlive {
    public int health;
    public int damage;

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
