/**EJERCICIO 3*/

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>();

        System.out.println("Tamaño: " + vector.size() + " - Capacidad: " + vector.capacity());


        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Contenido del vector: " + vector);
        vector.remove(1);
        vector.remove(1 );
        System.out.println("Contenido del vector: " + vector);

    }

}
