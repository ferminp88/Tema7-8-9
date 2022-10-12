
/**EJERCICIO  5 */
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        LinkedList<String> lista2 = new LinkedList<>(lista);

        System.out.println("Contenido de la lista: " + lista);
        System.out.println("Contenido de la lista: " + lista2);

    }
}
