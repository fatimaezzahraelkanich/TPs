package TP3;
import java.util.Scanner;
public class Ex6 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N;
                System.out.print("Entrez la taille du tableau : ");
                N = s.nextInt();
            int[] tableau = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Entrez la valeur pour l'élément " + (i+1) + " : ");
                tableau[i] = s.nextInt();
            }
            int[] TP = new int[N];
            int[] TN = new int[N];
            int tpSize = 0;
            int tnSize = 0;
            for (int i = 0; i < N; i++) {
                if (tableau[i] > 0) {
                    TP[tpSize] = tableau[i];
                    tpSize++;
                } else if (tableau[i] < 0) {
                    TN[tnSize] = tableau[i];
                    tnSize++;
                }
            }
            System.out.println("Tableau TP (composantes positives) :");
            for (int i = 0; i < tpSize; i++) {
                System.out.print(TP[i] + " ");
            }
            System.out.println();

            System.out.println("Tableau TN (composantes négatives) :");
            for (int i = 0; i < tnSize; i++) {
                System.out.print(TN[i] + " ");
            }

    }}

