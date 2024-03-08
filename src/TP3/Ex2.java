package TP3;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
            Scanner l = new Scanner(System.in);
            System.out.println("remplir le tableau");
            int[] T = new int[10];
            for(int i=0;i<T.length;i++){
                System.out.print("T["+i+"]=");
                T[i] = l.nextInt();}
            l.close();
            System.out.println("Les éléments du tableau T1");
            for(int i=0;i<T.length;i++)
                System.out.println(T[i]);
        }
    }
