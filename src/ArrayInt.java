/**EJERCICIO 6*/
import java.util.ArrayList;
import java.util.Objects;

public class ArrayInt {

    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++){
                lista.add(i);
            }
        System.out.println(lista);

            for (int i = 0; i < lista.size()-1; i++) {
                if (lista.get(i)% 2==0){
                    lista.remove(i);
                }
            }
        System.out.println(lista);
        }
    }







