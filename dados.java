importar  Java . útil _ aleatorio ;
        dado de clase  pública {
        aleatorio  privado aleatorio ;
        caras internas  privadas ;

        público  dado ( int  numCaras ) {
        aleatorio = nuevo  Aleatorio ();
        caras = numCaras ;
        }

public  int  lanzar () {
        volver  al azar . nextInt ( caras ) + 1 ;
        }
        }