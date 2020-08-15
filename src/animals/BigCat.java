package animals;

public abstract class BigCat extends Animal {


    public BigCat(String name, int age, char gender,  int health) {
        super(name, age, gender, new String[]{"steak", "celery"}, health, 24);
    }



}
