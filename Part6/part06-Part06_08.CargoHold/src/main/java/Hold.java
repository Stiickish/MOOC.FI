
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();

    }

    public int totalWeightOfSuitcases() {
        int weight = 0;

        for (Suitcase sc : list) {
            weight = weight + sc.totalWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Suitcase sc : list) {
            sc.printItems();
        }
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            list.add(suitcase);
        } else {
            return;
        }

    }

    public String toString() {

        String weightOutput = "(" + totalWeightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (list.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (list.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = list.size() + " suitcases";
        }
        return suitcaseOutput + weightOutput;
    }

}
