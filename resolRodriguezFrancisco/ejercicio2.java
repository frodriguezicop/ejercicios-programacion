package resolRodriguezFrancisco;

import java.util.Scanner;

public class ejercicio2 {
    private Scanner scanner;

    public void calcularPromedio() {
        scanner = new Scanner(System.in);
        int[] vector = new int[3];

        System.out.println("Ingresar los 3 enteros que se quieren promediar");
        for (int i = 0; i < vector.length; i++) {
            int entero = scanner.nextInt();
            vector[i] = entero;
        }

        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }

        double promedio = (double) suma / vector.length;
        System.out.println("El promedio es " + promedio);
        
        for(int i=0; vector[i]>promedio; i++) {
        	System.out.println(vector[i] +"Es mayor al promedio");
        }
        
        
    }
}

