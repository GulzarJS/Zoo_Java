package animals;

public class Giraffe extends Animal {
    public Giraffe(String name, int age, char gender, int health) {
        super(name, age, gender,  new String[]{"hay", "fruit"}, health, 28);
    }



    @Override
    public void treat() {
        System.out.println("Giraffe " + this.getName() + " had neck massage");
        this.setHealth(this.getHealth() + 4);
    }


}
