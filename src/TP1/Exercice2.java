package TP1;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.print( "Entrez le rayon: ");
        Scanner l= new Scanner(System.in);
        int r= l.nextInt();
        l.close();
        System.out.println("la surface est " +(Math.PI*Math.pow(r,2))+"le périmètre est :" +(Math.PI*r) );

    }
}
