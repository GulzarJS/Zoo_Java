import java.util.ArrayList;

public class Enclosure {

   private ArrayList<Animal>  enclosure;
   private FoodStore foodStore;
   private int waste;
   private int nbMonth;

    public Enclosure(ArrayList<Animal> enclosure, FoodStore foodStore ) {
        this.enclosure = enclosure;
        this.foodStore = foodStore;
        this.waste = 0;
        this.nbMonth = 1;
    }

    public ArrayList<Animal> getEnclosure() {
        return enclosure;
    }

    public void addAnimal(Animal animal){
        if(this.enclosure.size() <= 20) {
            enclosure.add(animal);
            animal.setEnclosure(this);

        }else{
            System.err.println("There is no empty place for new animal in enclosure");
        }
    }

    public void removeAnimal(Animal animal){
        if(this.enclosure.contains(animal)) {
            enclosure.remove(animal);
        }else{
            System.err.println("There is no " + animal + " in enclosure");
        }
    }

    public void removeWaste(int amountWaste){
        if(this.waste >= amountWaste){
            this.waste = this.waste - amountWaste;
        }else{
            System.err.println("The amount of waste you want to remove " +
                                "is more than amount of waste in enclosure\n" +
                                "So all waste in enclosure will be removed");
            this.waste = 0;
        }
    }

    public void addWaste(int amountWaste){
        this.waste = this.waste + amountWaste;
    }

    public FoodStore getFoodStore() {
        return foodStore;
    }

    public int getWasteSize() {
        return this.waste;
    }

    public int size() {
        return this.enclosure.size();
    }

    public void aMonthPasses(){
        this.nbMonth++;
    }

    public int getNbMonth() {
        return nbMonth;
    }

    public void printAnimals(){
        for ( Animal animal : this.enclosure){
            System.out.println(animal.getName());

        }
    }
}
