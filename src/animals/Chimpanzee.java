package animals;

public class Chimpanzee extends Ape {
    public Chimpanzee(String name, int age, char gender, int health) {
        super(name, age, gender, health, 24);
    }



    @Override
    public void treat() {
        System.out.println("Chimpanzee " + this.getName() + " played chase");
        this.setHealth(this.getHealth() + 4);
    }

}
