public class Principal {
public  static  void  main ( String [] args ) {
        volados  volados = new  volado ();
        int  numLanzamientos = 10 ;

        for ( int  i = 1 ; i <= numLanzamientos ; i ++) {
        Resultado Volado  resultado = volados . lanzar ();
        sistema _ fuera _ println ( "Lanzamiento " + i + ": " + resultado );
        }
        }
        }