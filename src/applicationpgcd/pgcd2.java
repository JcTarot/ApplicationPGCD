/*
ALGORITHME PGCD
VARIABLE  
ENTIER : x, y
DEBUT
    AFFICHE ("un entier :")
    LIRE(x)
    AFFICHE ("un entier :")
    LIRE(y)
    ECRIRE ("Le PGCD de ",x,"et",y, PGCDde2EntiersPositifs(x, y))
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
  FIN
 */
package applicationpgcd;

/**
 *
 * @author formation_gep
 */
public class pgcd2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
