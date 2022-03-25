package Armory;

class Stone extends Entity implements Throwable {
    @Override
    public void hurl() {
        System.out.println("A stone was thrown!");
    }

    @Override
    public String toString() {
        return "Stone";
    }
}
