package animals;

public class Bear extends Animal {
    public Bear(String name, int age, char gender, int health) {
        super(name, age, gender, new String[]{"fish", "steak"}, health, 32);
    }


    @Override
    public void treat() {
        System.out.println("Elephant " + this.getName() + " hugged");
        this.setHealth(this.getHealth() + 3);
    }

}
