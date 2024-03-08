package TP2;
import java.util.Scanner;
public class Ex2 {
        public static void main(String[] args) {
            System.out.println("entrer deux entiers naturel :");
            Scanner l = new Scanner(System.in);
            int x = l.nextInt();
            int N = l.nextInt();
            int i;
            int P = 1;
            for (i = 1; i <= N; i++) {
                P *= x;
            }
            System.out.println("x^N est : " + P);
        }
    }
