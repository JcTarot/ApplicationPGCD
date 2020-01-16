/*
ALGORITHME PGCD
VARIABLE  
ENTIER : x, y
DEBUT
    AFFICHE ("Saisir un nombre entier : ")
    LIRE(x)
    AFFICHE ("Saisir un nombre entier : ")
    LIRE(y)
    ECRIRE ("PGCD : ", PGCD(x, y))
FIN

FONCTION PGCD (a,b : Entier) : Entier
  DEBUT
      VARIABLE  
      ENTIER : a,b
        TANT_QUE a <> b FAIRE
            SI a > b FAIRE
                a <- a - b
                pgcd <- b
            SINON
                b <- b - a
            FIN_SI
        FIN_TANT_QUE
     RETOURNE a
                                 // autre
                                TANT_QUE a*b != 0 FAIRE
                                    SI a > b FAIRE
                                        a <- a - b
                                        pgcd <- b
                                    SINON
                                        b <- b - a
                                    FIN_SI
                                FIN_TANT_QUE
                             RETOURNE a + b
  FIN
 */
package applicationpgcd;

import java.util.Scanner;

/**
 *
 * @author Jean-Christophe Tarot formation_gep
 */
public class pgcd2 {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // SAISIE
        System.out.print("un entier : ");
        int x = reader.nextInt();
        System.out.print("un entier : ");
        int y = reader.nextInt();
        System.out.printf("pgcd : %d /n", PGCD2(x, y));
    }
    
    public static int PGCD2(int a, int b) {
        int pgcd=0;    
        while ( a != b ) { 
            if ( a >= b ) a = a-b;
            else b = b-a;
            }     
        return a;
    }
}
