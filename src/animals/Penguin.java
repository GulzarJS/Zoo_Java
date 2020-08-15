package animals;

public class Penguin extends Animal {
    public Penguin(String name, int age, char gender, int health) {
        super(name, age, gender, new String[]{"fish", "ice cream"}, health, 15);
    }


    @Override
    public void treat() {
        System.out.println("Penguin " + this.getName() + " watched a film");
        this.setHealth(this.getHealth() + 2);
    }


}
