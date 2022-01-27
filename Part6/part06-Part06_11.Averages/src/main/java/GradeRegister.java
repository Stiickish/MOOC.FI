
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {

        int sum = 0; //New variable to hold the sum. 
        double average = 0; //New variable to hold the average of grades

        //If the grades list is empty, return -1
        if (this.grades.isEmpty()) {
            average = -1;

            //If list isn't empty
            //New variable numOfGrades is set equals to the list size. 
            //Go through the list with a for each loop
            //Our variable sum will be sum + grade
            //Calculate the average and returning average
        } else {

            int numOfGrades = grades.size();

            for (int grade : grades) {
                sum = sum + grade;
            }
            //Calculating average
            average = 1.0 * sum / numOfGrades;
        }
        return average;
    }

    //Do exactly the same in this method as in averageOfGrades method. 
    //Swap the list grades with the new ArrayList
    public double averageOfPoints() {
        int sum = 0;
        double average = 0;

        if (this.examPoints.isEmpty()) {
            average = -1;
        } else {
            int numOfGrades = examPoints.size();

            for (int grade : examPoints) {
                sum = sum + grade;
            }
            average = 1.0 * sum / numOfGrades;
        }
        return average;
    }
}
