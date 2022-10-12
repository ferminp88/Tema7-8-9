/**EJERCICIO 7*/

public class DividirCero {

    public void Divide(int a,int b) {

        try {
            int resultado = a/b;
            System.out.println(resultado);
            System.out.println("Prueba demo");

        }catch (ArithmeticException e) {
            System.out.println(("Prueba demo"));
            System.out.println(("No se puede dividir por CERO"));
        }
    }
}
