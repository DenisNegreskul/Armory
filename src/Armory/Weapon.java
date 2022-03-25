package Armory;

abstract class Weapon extends Entity{
    private final String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    abstract public void attack();

    @Override
    public String toString() {
        return "Weapon{" + "name='" + name + '\'' + ", damage=" + damage + '}';
    }
}
