import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String[][] productos = new String[16][2];
        for (int i = 0; i < 16; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i+1) + ": ");
            productos[i][0] = lectura.nextLine();
            System.out.print("Ingrese el precio del producto #" + (i+1) + ": ");
            productos[i][1] = lectura.nextLine();
        }

        System.out.println("Catálogo de productos:");
        for (int i = 0; i < 16; i++) {
            System.out.println("Código " + i + ": " + productos[i][0] + " - Precio: " + productos[i][1]);
        }
        
        lectura.close();
       
    }
}



