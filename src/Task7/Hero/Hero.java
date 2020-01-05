package Task7.Hero;

public class Hero implements isAlive {
    public String name;
    public int health;
    public int damage;
    public int experience;
    public int level;

    public Hero() {
    }

    public Hero(String n) {
        this.name = n;
    }

    public Hero(String name, int damage, int health, int experience) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
