
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add: ");
                input = scanner.nextLine();

                this.todoList.add(input);
            } else if (input.equals("list")) {
                todoList.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                input = scanner.nextLine();
                todoList.remove(Integer.valueOf((input)));
            }

        }
    }

}
