
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*JokeManager manager = new JokeManager();
        manager.addJoke("What it red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJoke());
        }
        System.out.println("");
        System.out.println("Printing jokes: ");
        manager.printJokes();*/
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
