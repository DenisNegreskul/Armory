package Armory;

class Hammer extends Weapon {
    public Hammer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + " smashes with " + super.getDamage() + " damage!");
    }
}
