package animals;

public class Gorilla extends Ape {
    public Gorilla(String name, int age, char gender, int health) {
        super(name, age, gender, health, 32);
    }



    @Override
    public void treat() {
        System.out.println("Chimpanzee " + this.getName() + " has painted");
        this.setHealth(this.getHealth() + 4);
    }


}
