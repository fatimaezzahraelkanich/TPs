package TP3;
import java.util.Scanner;
import java.util.Arrays;

public class Ex7 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N;
                System.out.print("Entrez la taille du tableau : ");
                N = s.nextInt();
            int[] tableau = new int[N];
            for (int i =0; i < N; i++) {
                System.out.print("Entrez la valeur pour l'élément " + (i+1) + " : ");
                tableau[i] = s.nextInt();
            }
            int somme = 0;
            for (int i = 0; i < N; i++) {
                somme += tableau[i];
            }
            double moyenne = (double) somme / N;
            int[] T2 = Arrays.copyOf(tableau, N);
            System.out.println("Tableau copié T2  : " + Arrays.toString(T2));
            Arrays.sort(tableau);
            System.out.println("Tableau trié par ordre : " + Arrays.toString(tableau));
            System.out.println("la somme des éléments du tableaux est :"+somme);
            System.out.println("la moyenne des éléments du tableaux est :"+moyenne);

        }
    }
