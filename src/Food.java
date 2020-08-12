public class Food {

    private String name;
    private int health;
    private int waste;

    public Food(String name, int health, int waste) {
        this.name = name;
        this.health = health;
        this.waste = waste;
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

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public void setName(String name) {
        this.name = name;
    }
}
