package Task7.Enemy;

import Task7.Hero.isAlive;

public class Enemy implements isAlive {
    public int health;
    public int damage;

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
