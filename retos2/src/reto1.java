import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = lector.nextInt();

        double[] notas = new double[cantidadNotas];
        double sumaNotas = 0.0;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota #" + (i+1) + ": ");
            notas[i] = lector.nextDouble();
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / cantidadNotas;

        String anotacion;

        if (promedio < 3.0) {
            anotacion = "Reprobaste";
        } else if (promedio < 4.0) {
            anotacion = "Pasaste raspando";
        } else {
            anotacion = "Aprobaste con buenos resultados";
        }

        System.out.println("Tu nota final es " + promedio + ". " + anotacion);

        lector.close();
    }
}
