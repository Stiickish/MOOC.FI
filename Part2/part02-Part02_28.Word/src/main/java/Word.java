
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hello = word();
        System.out.println("Hello " + hello);

    }

    public static String word() {
        return "world";
    }

}
