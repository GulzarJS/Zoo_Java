package animals;

public class Lion extends BigCat {
    public Lion(String name, int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(name, age, gender, health);
    }

    @Override
    public void eat() {

    }

    @Override
    public void decreaseHealth() {

    }

    @Override
    // stroked
    public void treat() {
        System.out.println("Lion" + this.getName() + " stroked");
        this.setHealth(this.getHealth() + 2);
    }


}
