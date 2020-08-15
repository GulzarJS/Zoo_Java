package animals;

public class Elephant extends Animal {
    public Elephant(String name, int age, char gender, int health) {
        super(name, age, gender,  new String[]{"hay", "fruit"}, health, 36);
    }


    @Override
    public void treat() {
        System.out.println("Elephant " + this.getName() + " took a bath");
        this.setHealth(this.getHealth() + 5);

    }


}
