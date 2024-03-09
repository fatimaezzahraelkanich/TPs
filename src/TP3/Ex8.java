package TP3;
import java.util.Scanner;
import java.util.Arrays;
public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        System.out.print("Entrez la taille du tableau : ");
        N = s.nextInt();
        int[] T = new int[N];
        for (int i =0; i < N; i++) {
            System.out.print("Entrez la valeur pour l'élément " + (i+1) + " : ");
            T[i] = s.nextInt();
        }
        int resultat = calculerPlusGrandEcart(T);
        System.out.println("Le plus grand écart dans le tableau est : " + resultat);
    }

    public static int calculerPlusGrandEcart(int[] tableau) {
        if (tableau.length < 2) {
            return 0;
        }

        int minVal = tableau[0];
        int maxVal = tableau[0];

        for (int element : tableau) {
            if (element < minVal) {
                minVal = element;
            } else if (element > maxVal) {
                maxVal = element;
            }
        }

        int plusGrandEcart = maxVal - minVal;
        return plusGrandEcart;
    }
}