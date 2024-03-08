package TP2;
import java.util.Scanner;
public class Ex3 {
        public static void main(String[] args) {
            System.out.println("entrer un entier");
            Scanner l=new Scanner(System.in);
            int N=l.nextInt();
            l.close();
            int i ;
            float sum=0;
            for (i=1;i<=N;i++){
                sum+=1.0f/i ;}
            System.out.println("la somme est : "+sum);
        }
    }
