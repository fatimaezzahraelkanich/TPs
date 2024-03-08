package TP3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
            S scanner = new S(System.in);
            int N;
            do {
                System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
                N = scanner.nextInt();
            } while (N < 10 || N > 50);
            int[] tableau = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Entrez la valeur pour l'élément " + i + " : ");
                tableau[i] = scanner.nextInt();
            }
            int newSize = 0;
            for (int i = 0; i < N; i++) {
                if (tableau[i] != 5) {
                    tableau[newSize] = tableau[i];
                    newSize++;
                }
            }
            System.out.println("Tableau résultat :");
            for (int i = 0; i < newSize; i++) {
                System.out.print(tableau[i] + " ");
            }
        }
    }
