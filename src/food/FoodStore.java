package food;

import food.Food;

import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Map;

public class FoodStore {

    private Hashtable<Food, Integer> foodStore;


    public FoodStore(Hashtable<Food, Integer> foodStore) {
        this.foodStore = foodStore;
    }

    public  void addFood(Food food, int quantity){
        this.foodStore.put(food, quantity);
    }

    public  void TakeFood( Food food){
        if(isAvailable(food.getName())) {
            this.foodStore.replace(food, this.foodStore.get(food) - 1);
        }else{
            System.err.println("There is no " + food + " in the foodstore");
        }
    }

    public  boolean isAvailable(String foodName){
        return this.foodStore.get(foodName) > 0;
    }

    public  void printFoodStore(){
        for (Map.Entry<Food, Integer> entry: this.foodStore.entrySet()) {
            System.out.println(" " + entry.getKey().getName() + " = " + entry.getValue());
        }
    }


    public Food getFood(String foodName){
        Food food = null;
        for (Map.Entry<Food, Integer> entry : this.foodStore.entrySet()) {
            if (entry.getKey().getName().equals(foodName)) {
                food = entry.getKey();
            } else {
                System.err.println("There is no food which is named " + foodName);
            }
        }
        return food;
    }
}
