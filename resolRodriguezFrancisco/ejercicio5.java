package resolRodriguezFrancisco;
public class ejercicio5 {
    public static void fibbo(){
        int n = 6;
        int resultado = fibonacci(n);
        System.out.println("El elemento " + n + " de la serie de Fibonacci es: " + resultado);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }
}
