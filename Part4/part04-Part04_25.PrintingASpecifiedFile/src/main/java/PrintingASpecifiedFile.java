
import java.nio.file.Paths;     //Import so we can read from a txt
import java.util.Scanner;       //Import so we can use a Scanner for inputs

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //Inputs in console

        System.out.println("Which file should have its contents printed? ");

        String fileName = scanner.nextLine();   //Our user inputs

        //Try catch for file reading. If no txt file found
        //Error message will be printed intead
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            //while loop runs through our scanner input
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
