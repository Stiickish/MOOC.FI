
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

    public String longest() {

        //Return a null reference of there's no elements added to the list
        if (this.elements.isEmpty()) {
            return null;
        }

        //First we create an object reference for the object to be returned
        //It's first value is the first object on the list
        String longestWord = this.elements.get(0);

        //Go through the list for elements
        for (String s : this.elements) //Compare each object on the list
        //to the longestWord - we compare length
        //since we're searching for the longest
        {
            if (s.length() > longestWord.length()) {
                
                //If we find a word longer in the comparison
                //we assign it as the value of the longestWord object
                longestWord = s;
            }
        }
        //Finally, the object reference describing the
        //return object is returned
        return longestWord;
    }

}
