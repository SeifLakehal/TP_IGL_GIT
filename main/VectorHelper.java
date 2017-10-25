package main;

public class VectorHelper {

    static Scanner input = new Scanner(System.in);

    /**
     * Cette fonction calcule la Multiplication d'un nombre par un vecteur .
     * Exemple : soient T[1,5,7,19,6,14] et S = 2 le resultat est
     * R[2,10,14,38,12,28]
     *
     *
     * @param T le tableau
     * @param S le nombre pour effectuer l'operation
     * @return R[] le taleau resulatant
     */
    public static int[] MulVector(int T[], int S) throws Tai_Dif_Exception {
        int n = T.length;
        int[] R = new int[n];

        for (int i = 0; i < n; i++) {
            R[i] = T[i] * S;
        }

        return R;
    }
}
