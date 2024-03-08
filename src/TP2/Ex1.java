package TP2;
import java.util.Scanner;
public class Ex1 {
        public static void main(String[] args) {
            System.out.println("entrer le nombre des entiers :");
            Scanner l = new Scanner(System.in);
            int n = l.nextInt();
            int i=0;
            int sum=0;
            int p =1;
      /*  while(i<n){
            i++;
            System.out.println("entrer l'entier " +i);
            int  a = l.nextInt();
            sum+=a;
            p*=a;
        }
        l.close();
        System.out.println("la somme est : " +sum+ "\n La moyenne est :" +(sum/n)+"\n Le produit est : " +p);
do {
    i++;
    System.out.println("entrer l'entier " + i);
    int a = l.nextInt();
    sum += a;
    p *= a;
}while(i<n);
        l.close();
        System.out.println("la somme est : " +sum+ "\n La moyenne est :" +(sum/n)+"\n Le produit est : " +p);*/
            for(i=1;i<=n;i++){
                System.out.println("entrer l'entier " +i);
                int  a = l.nextInt();
                sum+=a;
                p*=a;
            }
            l.close();
            System.out.println("la somme est : " +sum+ "\n La moyenne est :" +(sum/n)+"\n Le produit est : " +p);

        }
    }
