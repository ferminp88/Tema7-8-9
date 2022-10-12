
/*
Utilizando InputStream y PrintStream,
crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el
parámetro "fileIn" al fichero dado en "fileOut".
*/



/**
 *
 * PREGUNTA PUNTO 4 -
 *
 Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
 si tuviésemos 1000 elementos para ser añadidos al mismo.

 RESPUESTA PUNTO 4 -
 Al llegar a la capacidad maxima se copia el vector ya creado
 y se crea un nuevo vector con el doble de capaciodad (datos almacenados en el array anterior + nuevas pocisiones),
 lo cual no es muy bueno , ya que cada vez que alcance su maximo , se van a crear copias y mas copias.
**/


public class Main {

    public static void main(String[] args) {

/*************CORRESPONDE A EJERCICIO 0 *******************/

        DeReversa revers = new DeReversa();
        revers.reverse("Hola mundo ");

/************CORRESPONDE A EJERCICIO 7 ****************/

        int a = 10;
        int b = 0;
        DividirCero op1 = new DividirCero();
        op1.Divide(a,b);

/************EJERCICIO 8 COPIAR FICHERO****************/

        CopiarArchivos copiar = new CopiarArchivos();
        String fromFile = "src/hola.txt";
        String toFile = "prueba/hola.txt";
        boolean result = copiar.copyFile(fromFile, toFile);
        System.out.println(result?
                "(Éxito! Fichero copiado)":
                "(Error! No se ha podido copiar el fichero)");
        
    }
}