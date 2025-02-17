import java.util.Scanner;

class Proyecto_1 {
    public static void verificarPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número " + numero + " es impar.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        try {
            verificarPar(numero);
            System.out.println("El número " + numero + " es par.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}