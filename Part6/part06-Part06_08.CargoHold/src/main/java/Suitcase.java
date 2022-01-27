
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yelon
 */
public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;

    }

    //Making a new method, to calculate the totalWeight
    public int totalWeight() {

        //Weight is 0 at default
        int weight = 0;

        //Going through the ArrayList
        //Sets the weight to weight + Item object weight
        for (Item i : items) {
            weight = weight + i.getWeight();
        }
        //Returns the weight
        return weight;
    }

    //Add item method
    public void addItem(Item item) {

        //If totalWeight method + item object weight
        //is less than our variable maxWeight, then add items. 
        //Otherwise do nothing
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    //Print items method
    public void printItems() {
        
        //For each loop, going through the ArrayList
        for (Item i : items) {
            System.out.println(i);
        }

    }
    //Heaviest item method
    public Item heaviestItem() {
        
        //If the list is empty, return null
        if (items.isEmpty()) {
            return null;
        }
        //Item object where we get index 0 at ArrayList
        Item heaviestItem = items.get(0);

        //For each loop going through the ArrayList
        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }

        }
        return heaviestItem;
    }

    public String toString() {

        //Making to new variables to hold our output
        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        //If ArrayList is empty, output is no items
        if (items.isEmpty()) {
            itemOutput = "no items";

            //If there is 1 item in the list, output is 1
        } else if (items.size() == 1) {
            itemOutput = "1 item";

            //If there is more than 1 item in the list
            //output will be displayed as ArrayList size
        } else {
            itemOutput = items.size() + " items";
        }
        //We return both output
        return itemOutput + weightOutput;
    }
}
