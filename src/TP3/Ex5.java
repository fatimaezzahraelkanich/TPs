package TP3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
    public class Ex5 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Veuillez saisir la taille du tableau: ");
            int N=s.nextInt();
            int[] T=new int[N];
            for(int i=0;i<T.length;i++){
                System.out.print("T["+(i+1)+"]= ");
                T[i] = s.nextInt();
            }
            System.out.println("Votre tableau initial: ");
            System.out.println(Arrays.toString(T));
            for (int i=0;i<N/2;i++) {
                int temp = T[i];
                T[i] = T[N-i-1];
                T[N-i-1] = temp;
            }
            System.out.println("Tableau inversé: ");
            for (int i=0;i<N;i++) {
                System.out.println("T["+(i+1)+"]= "+T[i]);
            }
            System.out.println();
            s.close();
        }
    }

