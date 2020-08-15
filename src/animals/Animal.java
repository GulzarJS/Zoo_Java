package animals;

import enclosure.Enclosure;

import java.util.Arrays;

public abstract class Animal {

    private String name;

    // age in month
    private int age;

    // gender : 'm' or 'f'
    private char gender;

    // types of food that the animals.Animal will eat
    private String[] eats;

    // how healthy the animal is. Min 0 Max 10. Reduce 2 for each month. Increase for each food.
    private int health;

    // average age that the animals.Animal lives to in months.
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
       return this.enclosure.getFoodStore().isAvailable(food);
    }

    public void decreaseHealth(){
        this.health = this.health - 2;
    }

    public  void eat(){
        for (String food : this.eats) {
            if(canEat(food)){
                this.health = this.health + this.enclosure.getFoodStore().getFood(food).getHealth();
                this.enclosure.getFoodStore().TakeFood(this.enclosure.getFoodStore().getFood(food));
                this.enclosure.addWaste(this.enclosure.getFoodStore().getFood(food).getWaste());
            }
        }
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }


    public void aMonthPasses(){
        this.decreaseHealth();
        this.eat();
        this.setAge(this.getAge() + 1);
    }

    public abstract void treat();

}