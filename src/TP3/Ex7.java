package TP3;
import java.util.Scanner;
import java.util.Arrays;

public class Ex7 {
    public class TableauExample {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N;
            do {
                System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
                N = s.nextInt();
            } while (N < 10 || N > 50);
            int[] tableau = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Entrez la valeur pour l'élément " + i + " : ");
                tableau[i] = scanner.nextInt();
            }int somme = 0;
            for (int i = 0; i < N; i++) {
                somme += tableau[i];
            }
            double moyenne = (double) somme / N;
            int[] T2 = Arrays.copyOf(tableau, N);
            System.out.println("Tableau T2 (copié) : " + Arrays.toString(T2));
            Arrays.sort(tableau);
            System.out.println("Tableau trié : " + Arrays.toString(tableau));
        }
    }
}
