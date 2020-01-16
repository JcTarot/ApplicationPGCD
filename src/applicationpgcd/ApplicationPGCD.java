/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationpgcd;

import java.util.Scanner;

/**
 *
 * @author Jean-Christophe Tarot 
 * formation_ecole publique
 */
public class ApplicationPGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // SAISIE
        System.out.print("un entier : ");
        int n1 = reader.nextInt();
        System.out.print("un entier : ");
        int n2 = reader.nextInt();
        System.out.printf("pgcd : %d", PGCDde2EntiersPositifs(n1, n2));
    }
    
    public static int PGCDde2EntiersPositifs(int a, int b) {
        int pgcd=0;    
        while ( a != 0 && b != 0 ) { 
            // affiche les valeurs de depart
            AfficheValeur(a, b);
            // test plus grand pour soustraire
            if ( a >= b ) {
                a = a-b;
                pgcd = b;
            } else {
                b = b-a;
                pgcd = a;
            }     
        }
        // affiche les valeurs calculées
        AfficheValeur(a, b);
        return pgcd;
    }

    public static void AfficheValeur(int a, int b) {
        // affiche les valeurs
        System.out.printf("a=%d \t b=%d \n", a, b);  
    }  
}
