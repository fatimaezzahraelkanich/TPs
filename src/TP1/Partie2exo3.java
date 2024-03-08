package TP1;
import java.util.Scanner;

public class Partie2exo3 {
        public static void main(String[] args) {
            System.out.print("entrer un entier : ");
            Scanner l = new Scanner(System.in);
            int a = l.nextInt();
            l.close();
            int i ;
            int sum = 0;
            for(i=1;i<a;i++) {
                if (a % i == 0)
                    sum+=i;
            }
            System.out.println(sum);
            if(sum==a)
                System.out.println("  ce nombre est  parfait");

        }
    }

