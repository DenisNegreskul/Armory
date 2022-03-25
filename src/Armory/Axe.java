package Armory;

class Axe extends Weapon implements Throwable{
    public Axe(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + " swings with " + super.getDamage() + " damage!");
    }

    @Override
    public void hurl() {
        System.out.println("The " + super.getName() + " was thrown!");
        attack();
    }
}
