public class ArrayAverage {

    /* Schreiben Sie eine Methode, die ein int[] values übergeben bekommt und den Durschnitt aller Werte zurückgibt.
    Lagern Sie dabei das Aufsummieren der Werte in eine eigene Methode aus.*/
    public static int intArrayAverageWithMethod(int[] values) {
        // Ist das values Array leer wird 0 zurückgegeben.
        if(values == null || values.length == 0) {
            return 0;
        }

        // Der Durchschnitt ist die Summe aller Element geteilt durch die Zahl der Elemente.
        // Die Zahl der Elemente entspricht der Länge des Arrays.
        int average = sumValues(values) / values.length;

        return average;
    }

    /*
        Diese Methode berechnet die Summe aller Elemente im Array.
        Dazu wird das gesamte Array mit einer for-Schleife durchlaufen und jedes Element des Arrays auf sum addiert.
     */
    public static int sumValues(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 5, 7, 8, 9, 1, 6, 3, 4, 0};
        int testAverage = intArrayAverageWithMethod(testArray);

        if(testAverage == 4) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your solution was " + testAverage + " but 4 is correct.");
        }
    }
}
