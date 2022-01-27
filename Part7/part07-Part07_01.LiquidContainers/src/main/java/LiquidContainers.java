
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/" + "100");
            System.out.println("Second: " + second + "/" + "100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" "); //Splits at break
            String UserCommand = parts[0];  //Store it at index 0
            int amount = Integer.valueOf(parts[1]); //Parse the input to an Integer

            //If our amount is less than 1, then continue
            if (amount < 1) {
                continue;
            }
            //If input is "add"
            //And first container + amount is less than 0
            //Then first is the total of first + amount. 

            //If container + amount isn't less than 0,
            //then container first must be at 100 % (full)
            if (UserCommand.equals("add")) {
                if (first + amount <= 100) {
                    first = first + amount;
                } else {
                    first = 100;
                }
            }
            //If input is "move"
            //And amount is bigger than first container
            //Second container + first container

            //If amount isnt bigger than second container
            //second container + first container
            //first container remove amounts that is transfered to container second
            if (UserCommand.equals("move")) {
                if (amount > first) {
                    second = second + first;
                } else {
                    second = second + amount;
                    first = first - amount;
                }
            }
            //If input is "remove"
            //And second container minus the amount is bigger or same as 0
            //second container minus amount
            if (UserCommand.equals("remove")) {
                if (second - amount >= 0) {
                    second = second - amount;
                }
            }
            //If second is bigger than 100 (full capacity)
            //second container is full and its at 100 (full capacity)
            if (second > 100) {
                second = 100;
            }
        }
    }

}
