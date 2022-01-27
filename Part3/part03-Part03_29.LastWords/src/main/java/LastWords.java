
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //Scanner for inputs

        while (true) {  //While loop running until condition is met
            String input = scanner.nextLine(); //So user can inputs in consol
            if (input.equals("")) {
                break;
            }
            String[] last = input.split(" ");
            System.out.println(last[last.length - 1]);
        }

    }
}
