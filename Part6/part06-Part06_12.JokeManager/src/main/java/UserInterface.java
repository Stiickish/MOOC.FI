
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yelon
 */
public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager,Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;

    }

    public void start() {

        while (true) {
            System.out.println("Commands: " + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String addJoke = scanner.nextLine();

                jokeManager.addJoke(addJoke);
            } else if (input.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (input.equals("3")) {
                jokeManager.printJokes();
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
