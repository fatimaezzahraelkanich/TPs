package TP1;
import java.util.Scanner;
public class Exercice5 {

        public static void main(String[] args) {

            System.out.print("Entrez un entier : ");
            Scanner l = new Scanner(System.in);
            int n = l.nextInt();
            int i;
            int a=1;
            l.close();
            if (n == 0) {
                System.out.println("la factorielle de 0 est 1");
            }
            else {
                for (i = 1; i <= n; i++ )
                    a*=i;
            }
            System.out.println("la valeur est :" +a);
        }}
