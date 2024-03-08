package TP1;
import java.util.Scanner;
public class Partie2exo2 {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the g
        public static void main(String[] args) {
            System.out.print("Entrer l'heure puis minute :");
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m =sc.nextInt();
            sc.close();
            if (h==23 && m==59)
                System.out.println("h=0 et m=00");
            else if (m==59)
                System.out.println("l'heure est :"+(h+1)+" minute est : 00");
            else
                System.out.println("l'hure est :" +h +" minute est : "+(m+1));
        }
    }

