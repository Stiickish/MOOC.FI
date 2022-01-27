
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //For user inputs

        while(true){ //while loop until condition is true
        String input = scanner.nextLine(); //for user to write in consol
        if(input.equals("")){ //if inputs equals empty line, then stop the loop and program
        break;
        }
        String[] first = input.split(" ");
            System.out.println(first[0]);
        }
    }
}
