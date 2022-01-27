
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {

        //I er start point. Hvis i er større end number som er 5, skal den printe fra 5 til 1
        //Hvis i var 1 som start, og i var mindre end 5, skulle den printe fra 1-5
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
