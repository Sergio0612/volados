importar  Java . útil _ aleatorio ;

        volado de clase {
        aleatorio  privado aleatorio ;

        público  volado () {
        aleatorio = nuevo  Aleatorio ();
        }

public  Resultado Volado  lanzar () {
        resultado int = aleatorio . siguienteInt ( 2 ); // 0 representa cara, 1 representa cruz

        si ( resultado == 0 ) {
        devuelve  ResultadoVolado . CARA ;
        } más {
        devuelve  ResultadoVolado . CRUZ ;
        }
        }
        }

enum  Resultado Volado {
    cara ,
    Cruz
}