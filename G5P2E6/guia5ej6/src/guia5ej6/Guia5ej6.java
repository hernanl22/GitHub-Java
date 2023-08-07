package guia5ej6;

import java.util.Scanner;

public class Guia5ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int aux = 0;
        int suma = 0;
        boolean magica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {

                    System.out.println("ingrese el numero fila " + i + " columna " + j + " : ");
                    aux = leer.nextInt();
                    if (aux < 1 || aux > 9) {
                        System.out.println("el numero debe estar entre 1 y 9, ingrese nuevamente");

                    }
                } while (aux < 1 || aux > 9);
                matriz[i][j] = aux;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i) {
                    suma += matriz[i][j];
                }

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            int suma1 = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                suma1 += matriz[i][j];
            }
            if (suma1 != suma) {
                magica = false;
            }
        }
        for (int j = 0; j < matriz.length; j++) {
            int suma1 = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma1 += matriz[i][j];
            }
            if (suma1 != suma) {
                magica = false;
            }
        }
        for (int[] elemen : matriz) {
            for (int i : elemen) {
                System.out.print(" | " + i);

            }System.out.println("");

        }System.out.println("___________________________");
        if (magica) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");

        }

    }
}
