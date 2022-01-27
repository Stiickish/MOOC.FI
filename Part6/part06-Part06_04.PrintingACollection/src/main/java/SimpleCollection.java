
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String output = "";
        String listOfElements = "";

        //If its the last in the list or the only in the list, then no line break
        for (String s : elements) {
            if (s.equals(elements.get(elements.size() - 1))) {
                listOfElements = listOfElements + s;
            } else {
                listOfElements = listOfElements + s + "\n";
            }
        }

        if (elements.size() == 1) {
            output = "The collection " + this.name + " has 1 element:\n" + listOfElements;
        } else if (elements.isEmpty()) {
            output = "The collection " + this.name + " is empty.";
        } else {
            output = "The collection " + this.name + " has " + elements.size() + " elements:\n" + listOfElements;
        }

        return output;
    }
}
