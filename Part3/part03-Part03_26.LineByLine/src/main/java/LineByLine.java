
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.isEmpty()) { //If input is not empty
            String[] text = input.split(" ");
            for (String s : text) {
                System.out.println(s);
            }
           input = scanner.nextLine();
        }
        

    }

}
