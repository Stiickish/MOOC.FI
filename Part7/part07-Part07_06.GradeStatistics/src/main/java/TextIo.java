
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
public class TextIo {

    private Scanner scanner;
    private Grade grade;

    public TextIo(Scanner scanner, Grade grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void start() {
        System.out.println("Enter points total, -1 stops: ");
        while (true) {

            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                grade.print();
                break;
            } else {
                grade.addGrade(points);
            }
        }
    }

}
