package Task7.Hero;

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
