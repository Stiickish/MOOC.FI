
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        
        for (int value : array) { //for each loop kører igennem arrayet
            for (int j = 0; j < value; j++) { //for loop. j starter på 0. j er mindre end arrayet, og incrementer
                System.out.print("*"); //printer stjernene i arrayet. 5 på første linje, 1 på næste osv. 
            }
            System.out.println(""); //Printer ned af 
        }

    }
}
