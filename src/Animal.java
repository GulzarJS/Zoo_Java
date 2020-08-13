import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Animal {

    private String name;

    // age in month
    private int age;

    // gender : 'm' or 'f'
    private char gender;

    // types of food that the Animal will eat
    private String[] eats;

    // how healthy the animal is. Min 0 Max 10. Reduce 2 for each month. Increase for each food.
    private int health;

    // average age that the Animal lives to in months.
    private int lifeExpectancy;

    private Enclosure enclosure;

    public Animal(String name, int age, char gender, String[] eats, int health, int lifeExpectancy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getEats() {
        return eats;
    }

    public void setEats(String[] eats) {
        this.eats = eats;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public boolean canEat(String food) {
        if (Arrays.asList(eats).contains(food)) return true;
        return false;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public abstract void eat();
    public abstract void decreaseHealth();
    public abstract void treat();
    public abstract boolean aMonthPasses();

}