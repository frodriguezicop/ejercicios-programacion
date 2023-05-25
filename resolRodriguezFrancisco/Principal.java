package resolRodriguezFrancisco;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int ejer;
		System.out.println("Ejercicio 1");
		System.out.println("Ejercicio 2");
		System.out.println("Ejercicio 3");
		System.out.println("Ejercicio 4");
		System.out.println("Ejercicio 5");
		System.out.println("Ejercicio 6");
		System.out.println("Ejercicio 7");
		System.out.println("Ejercicio 8");
		System.out.println("Ejercicio 9");
		System.out.println("Ejercicio 10");
		System.out.println("Ejercicio 11");
		System.out.println("Ejercicio 12");
		System.out.println("Ejercicio 13 (12b)");
		System.out.println("Ejercicio 14");
		System.out.println("Ejercicio 15");
		System.out.println("Ejercicio 16");
		System.out.println("Ejercicio 17");
		System.out.println("Seleccione ejercicio");
		ejer= scanner.nextInt();

		while (ejer !=0) {

		switch (ejer) {
		case 1: {
			System.out.println("Eligió el ejercicio 1");
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 2: {
			System.out.println("Eligió el ejercicio 2");
            ejercicio2 ejercicio2 = new ejercicio2();
            ejercicio2.calcularPromedio();
            System.out.println("Seleccione ejercicio");
            ejer = scanner.nextInt();
            break;
		}
		case 3: {
			System.out.println("Eligió el ejercicio 3");
			ejercicio3 ejercicio3 = new ejercicio3();
			ejercicio3.capicua();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 4: {
			System.out.println("Eligió el ejercicio 4");
			ejercicio4 ejercicio4 = new ejercicio4();
			ejercicio4.verificarContra();
			
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 5: {
			System.out.println("Eligió el ejercicio 5");
			ejercicio5 ejercicio5 = new ejercicio5();
			ejercicio5.fibbo();
			ejercicio5.fibonacci(ejer);
			ejer= scanner.nextInt();
			System.out.println("Seleccione ejercicio");
			break;
		}
		case 6: {
			System.out.println("Eligió el ejercicio 6");
			ejercicio6 ejercicio6 = new ejercicio6();
			ejercicio6.esPrimo();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 7: {
			System.out.println("Eligió el ejercicio 7");
			ejercicio7 ejercicio7 = new ejercicio7();
			ejercicio7.cuentaPalabras();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 8: {
			System.out.println("Eligió el ejercicio 8");
			ejercicio8 ejercicio8 = new ejercicio8();
			ejercicio8.contarBilletes();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 9: {
			System.out.println("Eligió el ejercicio 9");
			ejercicio9 ejercicio9 = new ejercicio9();
			ejercicio9.ordSeleccion();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 10: {
			System.out.println("Eligió el ejercicio 10");
			ejercicio10 ejercicio10 = new ejercicio10();
			ejercicio10.calcularDigitoVerificadorISBN();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 11: {
			System.out.println("Eligió el ejercicio 11");
			ejercicio11 ejercicio11 = new ejercicio11();
			ejercicio11.operacionesVariables();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 12: {
			System.out.println("Eligió el ejercicio 12");
			ejercicio12 ejercicio12 = new ejercicio12();
			ejercicio12.ejerA();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 13: {
			System.out.println("Eligió el ejercicio 12b");
			ejercicio12b ejercicio12b = new ejercicio12b();
			ejercicio12b.ejerB();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 14: {
			System.out.println("Eligió el ejercicio 13A");
			ejercicio13A ejercicio13A = new ejercicio13A();
			ejercicio13A.recursiva();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 15: {
			System.out.println("Eligió el ejercicio 13B");
			ejercicio13B ejercicio13B = new ejercicio13B();
			ejercicio13B.iterativa();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 16: {
			System.out.println("Eligió el ejercicio 14");
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 17: {
			System.out.println("Eligió el ejercicio 15");
			ejercicio15 ejercicio15 = new ejercicio15();
			ejercicio15.vocalesMayuscula();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		case 18: {
			System.out.println("Eligió el ejercicio 16");
			ejercicio16 ejercicio16 = new ejercicio16();
			ejercicio16.notas();
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
			break;
		}
		default:
			System.out.println("No Eligio numero correcto");
			System.out.println("Seleccione ejercicio");
			ejer= scanner.nextInt();
		}
		}
		
		if(ejer==0) {
			System.out.println("Numero Incorrecto");
		}
	}

}
