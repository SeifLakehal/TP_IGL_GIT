
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VectorHelper {
	static Scanner input = new Scanner(System.in);

        /**
         * 
         * @param prompt
         * @return 
         */
    public static int getInt(String prompt) {
        System.out.print(prompt + " ");
        int entier = input.nextInt();
        input.nextLine(); // Se d?barrasser de cette ligne
        return entier;
    }

    /**
     * 
     * @param n
     * @return 
     */
    public static int [ ]  RemplirTab(int n) {
        int i;
        int[ ] tab = new int[n];
        for (i = 0; i < tab.length; i++) {
            tab[i] = getInt("       Entr?e n?" + (i + 1));
        }
        return tab;
    }

    /**
     * 
     * @param tab 
     */
    public static void AfficherTab(int tab[]) {
        System.out.print("| ");
        for (int i = 0; i < tab.length; ++i) {
            System.out.print(tab[i] + " | ");
        }
        System.out.println("");
        System.out.println("");
    }

    /**
     * 
     * @param tab
     * @return 
     */
    public static int[] InverserTab(int tab[]) {
        int n = tab.length;
        int[] sab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            sab[i] = tab[n - 1];
            n--;
        }
        return sab;
    }

    /**
     * 
     * @param tab
     * @return 
     */
    public static int[] TriBulles(int tab[]) {
        boolean tab_in_order = false;
        int taille, temp;
        taille = tab.length;
        while (!tab_in_order) {
            tab_in_order = true;
            for (int i = 0; i < taille - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    tab_in_order = false;
                }
            }
            taille--;
        }
        return tab;
    }

   /**
    * 
    * @param T
    * @param S
    * @return
    * @throws Tai_Dif_Exception 
    */
    public static int[] SomVector(int T[], int S[]) throws Tai_Dif_Exception  {
        int n = T.length, m = S.length;
        int[] R = new int[n];
        
        try {
            if (n == m) {
                for (int i = 0; i < n; i++) {
                    R[i] = T[i] + S[i];
                }
            }else
                throw new Tai_Dif_Exception();
        }catch (Tai_Dif_Exception e){
        
        }

        return R;
    }

    /**
     * 
     * @param tab 
     */
    public static void MaxMin(int tab[]) {
        int min, max, n = tab.length;
        int[] S = new int[n];
        S = TriBulles(tab);
        min = S[0];
        System.out.println("Le minimum de ce tableau est : " + min);
        max = S[n - 1];
        System.out.println("La maximum de ce tableau est : " + max);
    }
    
 
     
    /**
     * 
     * @throws IOException
     * @throws Tai_Dif_Exception 
     */
    public static void gestion_menu() throws IOException, Tai_Dif_Exception {
        int cas, n, m,s;
        int[] tab;
        int[] sab;
        BufferedReader syl1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1-Tri des ?l?ments d?un vecteur");
        System.out.println("2-La somme de deux vecteurs");
        System.out.println("3-Inverser les ?l?ments d'un vecteur");
        System.out.println("4-Max, Min d'un vecteur");
        System.out.println("5-La Multiplication du vecteur par un nombre ");
        System.out.println("6-Quitter");
        System.out.println("");
        System.out.println("");
        System.out.print("        Veuillez entrer votre choix :      ");
        cas = Integer.parseInt(syl1.readLine());
        switch (cas) {
            case 1: {
                System.out.println("*----------------------*");
                System.out.println("    Tri d'un vecteur");
                System.out.println("*----------------------*");
                System.out.println();
                n = getInt("Donnez le nombre d'?l?ments de vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                AfficherTab(TriBulles(tab));
                gestion_menu();
            }
            break;
            case 2: {
                System.out.println("*------------------------*");
                System.out.println("La somme des deux vecteurs");
                System.out.println("*------------------------*");
                n = getInt("Donnez le nombre d'?l?ments du premier vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                m = getInt("Donnez le nombre d'?l?ments de deuxiemme vecteur :");
                sab = new int[m];
                sab = RemplirTab(m);
                System.out.println("Le vecteur resultant est : ");
                tab = SomVector(tab, sab);
                if(m==n) AfficherTab(tab);
                gestion_menu();
            }
            break;
            case 3: {
                System.out.println("*---------------------------------*");
                System.out.println("Inverser les elements d'un vecteur");
                System.out.println("*---------------------------------*");
                System.out.println("");
                System.out.println("");
                n = getInt("Donnez le nombre d'?l?ments du vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                AfficherTab(InverserTab(tab));
                gestion_menu();
            }
            break;
            case 4: {
                System.out.println("*---------------------------------*");
                System.out.println("Le Min et le Max d'un vecteur");
                System.out.println("*---------------------------------*");
                System.out.println("");
                System.out.println("");
                n = getInt("Donnez le nombre d'entr?es du vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                System.out.println("*--------------------------------------*");
                MaxMin(tab);
                System.out.println("*--------------------------------------*");
                gestion_menu();
            }
            break;
            case 5: {
                System.out.println("*------------------------*");
                System.out.println("La Multiplication du vecteur par un nombre ");
                System.out.println("*------------------------*");
                n = getInt("Donnez le nombre d'entr?es du vecteur :");
                tab = new int[n];
                tab = RemplirTab(n);
                s = getInt("Donner Le nombre :");           
                System.out.println("Le vecteur resultant est : ");
                tab = MulVector(tab,s);
                AfficherTab(tab);
                gestion_menu();
            }
            break;
            case 6: {
                System.out.println("Merci d'avoir utiliser mon programme !");
            }
        }
    }
}