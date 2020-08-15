package animals;

public abstract class Ape extends Animal {

    public Ape(String name, int age, char gender, int health, int lifeExpectancy) {
        super(name, age, gender, new String[]{"fruit", "ice cream"}, health, lifeExpectancy);
    }



}
