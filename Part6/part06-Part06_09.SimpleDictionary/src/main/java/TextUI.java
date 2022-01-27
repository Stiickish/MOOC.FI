
import java.util.ArrayList;
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;

    }

    public void start() {

        while (true) {

            System.out.println("Command:");
            String userCommand = scanner.nextLine();

            if (userCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (userCommand.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.simpleDictionary.add(word, translation);

            } else if (userCommand.equals("search")) {

                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();

                if (simpleDictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");

                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(toBeTranslated));
                }

            } else {
                System.out.println("Unknown command");
            }

        }

    }

}
