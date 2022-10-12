/**EJERCICIO 2 **/

public class ArrayBidi {

    public static void main(String[] args) {


    int [][] arrayB = new int[2][4];

    arrayB[0][0] = 1;
    arrayB[0][1] = 2;
    arrayB[0][2] = 3;
    arrayB[0][3] = 4;

    arrayB[1][0] = 100;
    arrayB[1][1] = 200;
    arrayB[1][2] = 300;
    arrayB[1][3] = 400;

        for (int i = 0; i < arrayB.length; i++) {
        for (int j = 0; j < arrayB[i].length; j++) {
            System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayB[i][j]);
        }
    }
    }

}
