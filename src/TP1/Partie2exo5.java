package TP1;
import java.util.System;
public class Partie2exo5 {
        public static void main(String[] args) {
            int b[][]=new int[22][2];
            int num=0,sum=0,sansbut=0,max=0;
            System.out.println("- Joueur N° : Nbr de buts");
            Scanner s=new Scanner(System.in);
            for(int i=0;i<22;i++){
                b[i][0]=i;
                System.out.print("- Joueur N°"+(b[i][0]+1)+": ");
                b[i][1]=s.nextInt();
                sum+=b[i][1];
                if(b[i][1]>max) {
                    max=b[i][1];
                    num=i+1;
                }
                if(b[i][1]==0)
                    sansbut++;
            }
            System.out.println("\n+ Le buteur : Jouer N°"+num);
            System.out.println("+ Le nombre total des buts: "+sum);
            System.out.println("+ Le nombre des joueurs qui n'on pas marqué: "+sansbut);
        }
    }
}
