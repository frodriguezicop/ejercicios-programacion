package resolRodriguezFrancisco;
import java.util.Scanner;

public class ejercicio10 {
    public static void calcularDigitoVerificadorISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar codigo ISBN sin el digito verificador: ");
        String codigoISBN = scanner.nextLine();

        int suma = 0;
        int multiplicador = 1;
        for (int i = 0; i < codigoISBN.length(); i++) {
            char digito = codigoISBN.charAt(i);
            int valor = Character.getNumericValue(digito);
            suma += valor * multiplicador;
            multiplicador++;
        }

        int digitoVerificador = suma % 11;
        String isbnCompleto = codigoISBN + (digitoVerificador == 10 ? "X" : digitoVerificador);

        System.out.println("Codigo ISBN: " + isbnCompleto);
    }
}

