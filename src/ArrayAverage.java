public class ArrayAverage {

    /* Schreiben Sie eine Methode, die ein int[] values übergeben bekommt und den Durschnitt aller Werte zurückgibt.
    Lagern Sie dabei das Aufsummieren der Werte in eine eigene Methode aus.*/
    public static int intArrayAverageWithMethod(int[] values) {
        return 0;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 5, 7, 8, 9, 1, 6, 3, 4, 0};
        int testSum = intArrayAverageWithMethod(testArray);

        if(testSum == 4) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your solution was " + testSum + " but 4 is correct.");
        }
    }
}
