import java.util.Hashtable;

public class MainClass {

    public static void main(String[] args) {

        Food hay = new Food("hay", 1,4);
        Food steak = new Food("steak", 3,4);
        Food fruit = new Food("fruit", 2,3);
        Food celery = new Food("celery", 0,1);


        FoodStore foodStore = new FoodStore(new Hashtable<Food, Integer>());

        foodStore.addFood(hay, 10);
        foodStore.addFood(steak, 8);
        foodStore.addFood(fruit, 7);
        foodStore.addFood(celery, 3);

        foodStore.printFoodStore();
    }
}
