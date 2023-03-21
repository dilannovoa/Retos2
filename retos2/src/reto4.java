import java.util.Scanner;

public class reto4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int cantidadNumeros = lector.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int contadorDeDos = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = lector.nextInt();

            if (numeros[i] == 2) {
                contadorDeDos++;
            }
        }

        System.out.println("La cantidad de veces que se ingresó el número 2 es: " + contadorDeDos);

        lector.close();
    }
}
