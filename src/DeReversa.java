public class DeReversa {

     public  static void  reverse (String cadena) {
            String cadenaInvertida = "";
            for (int x = cadena.length() - 1; x >= 0; x--)
                cadenaInvertida = cadenaInvertida + cadena.charAt(x);
         System.out.println(cadenaInvertida);
     }
} ;

