package Armory;

import java.util.Arrays;

public class Demonstration {
    private Entity[] entities;

    public Demonstration() {
        entities = new Entity[3];
        entities[0] = new Hammer("Hammer", 25);
        entities[1] = new Axe("Axe", 15);
        entities[2] = new Stone();
    }

    @Override
    public String toString() {
        return "Demonstration{" + "entities=" + Arrays.toString(entities) + '}';
    }

    public void start() {
        for (Entity entity : entities) {
            if (entity instanceof Weapon) {
                ((Weapon) entity).attack();
            }
            if (entity instanceof Throwable) {
                ((Throwable) entity).hurl();
            }
        }
    }
}
