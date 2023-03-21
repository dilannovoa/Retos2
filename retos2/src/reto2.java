import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nadadores: ");
        int cantidadNadadores = lector.nextInt();

        String[] nombres = new String[cantidadNadadores];
        double[] tiempos = new double[cantidadNadadores];

        for (int i = 0; i < cantidadNadadores; i++) {
            System.out.print("Ingrese el nombre del nadador #" + (i+1) + ": ");
            nombres[i] = lector.next();
            System.out.print("Ingrese el tiempo del nadador #" + (i+1) + ": ");
            tiempos[i] = lector.nextDouble();
        }

        System.out.println("Nadadores y tiempos:");

        for (int i = 0; i < cantidadNadadores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i]);
        }

        int Ganador = 0;

        for (int i = 1; i < cantidadNadadores; i++) {
            if (tiempos[i] < tiempos[Ganador]) {
                Ganador = i;
            }
        }

        System.out.println("El ganador es " + nombres[Ganador] + " con un tiempo de " + tiempos[Ganador] + " segundos.");

        lector.close();
    }
}
