import java.util.Hashtable;
import java.util.Map;

public class FoodStore {

    static Hashtable<Food, Integer> foodStore = new Hashtable<Food, Integer>();

    public static void addFood( Food food, int quantity){
        foodStore.put(food, quantity);
    }

    public static void TakeFood( Food food){
        if(isAvailable(food.getName())) {
            foodStore.replace(food, foodStore.get(food) - 1);
        }else{
            System.err.println("There is no " + food + " in the foodstore");
        }
    }

    public static boolean isAvailable(String foodName){
        if(foodStore.get(foodName) > 0) return true;
        return false;
    }

    public static void printFoodStore(Hashtable<Food, Integer> foodStore){
        for (Map.Entry<Food, Integer> entry: foodStore.entrySet()) {
            System.out.println(" " + entry.getKey().getName() + " = " + entry.getValue());
        }
    }
}
