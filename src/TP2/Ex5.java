package TP2;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
import java.util.Scanner;
public class Ex5 {
        public static void main(String[] args) {

            System.out.print("Entrez un entier : ");
            Scanner l = new Scanner(System.in);
            int n = l.nextInt();
            int i=1;
            int a=1;
            l.close();
            if (n == 0) {
                System.out.println("la factorielle de 0 est 1");
            }
            else {
            /*for (i = 1; i <= n; i++ )
                a*=i;
        }*/
                while(i<=n){
                    a*=i;
                    i++;
                }
                System.out.println("la valeur est :" +a);}
        }}

