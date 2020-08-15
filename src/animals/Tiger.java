package animals;

public class Tiger extends BigCat {
    public Tiger(String name, int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(name, age, gender, health);
    }

    @Override
    public void treat() {
        System.out.println("Tiger" + this.getName() + " stroked");
        this.setHealth(this.getHealth() + 3);
    }


}
