import java.util.Hashtable;
import java.util.Map;

public class Foodstore {

    static Hashtable<Food, Integer> foodStore = new Hashtable<Food, Integer>();

    public static void main(String[] args) {
        Food hay= new Food("hay", 1, 4);
        Food steak= new Food("steak", 3, 4);
        foodStore.put(hay, 5);
        foodStore.put(steak, 8);

        printFoodStore(foodStore);



//        TakeFood(hay);

//
//        foodStore.replace("steak", foodStore.get("steak") - 1);
//
//        System.out.println(foodStore);

    }

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
