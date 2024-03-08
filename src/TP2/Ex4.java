package TP2;
import java.util.Scanner;
public class Ex4 {
public static void main(String[] args) {
    System.out.print( "Entrez deux entiers : ");
    Scanner l= new Scanner(System.in);
    float x= l.nextFloat();
    int n= l.nextInt();
    l.close();
    System.out.println("la valeur est :" +Math.pow(x,n));
}
}
