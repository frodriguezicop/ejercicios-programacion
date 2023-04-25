
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int res=0;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar el Primer número");
		num1=scanner.nextInt();
		System.out.println("Ingresar el Segundo número");
		num2=scanner.nextInt();
		
		res=num1+num2;
		
		System.out.println("El resultado de la suma es: " +res);
	}

}
