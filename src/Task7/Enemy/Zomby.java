package Task7.Enemy;

public class Zomby extends Enemy {
    public Zomby() {
    }

    public static Zomby zomby = new Zomby();

    public Zomby(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}
