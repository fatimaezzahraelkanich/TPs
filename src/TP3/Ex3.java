package TP3;
import java.util.Scanner;
public class Ex3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N;
            do {
                System.out.print("Entrez la taille du tableau entre 10 et 50: ");
                N = s.nextInt();
            } while (N < 10 || N > 50);
            int[] tableau = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Entrez la valeur pour l'élément " + (i+1) + " : ");
                tableau[i] = s.nextInt();
            }
            System.out.println("Tableau résultat :");
            for (int i = 0; i < N; i++) {
                System.out.print(tableau[i] + " ");
            }
        }
    }
