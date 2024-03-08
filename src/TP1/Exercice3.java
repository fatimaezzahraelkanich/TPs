package TP1;
import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args) {
        System.out.print("Entrez deux entiers : ");
        Scanner l = new Scanner(System.in);
        int a = l.nextInt();
        int b = l.nextInt();
        l.close();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("la valeur de a est : " + a + "\nla valeur de b est :" + b);
    }
}
