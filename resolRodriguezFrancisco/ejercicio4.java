package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio4 {

	public void verificarContra() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nueva contraseña");
		String contraseña = scanner.next();
		
		if(esSegura(contraseña)) {
			System.out.println("La contraseña es Segura");
		}else {
			System.out.println("La contraseña no es segura");
		}	
	}
	
	
	public boolean esSegura(String contraseña) {
		int numero = 0;
		int mayuscula = 0;
		int minuscula = 0;
		char c;
		if(contraseña.length() > 8) {
			
			for (int i=0; i<contraseña.length(); i++) {
				 
				c = contraseña.charAt(i);
				
				if(Character.isDigit(c)) {
					numero++;
				}else if(Character.isUpperCase(c)) {
					mayuscula++;
				}else if(Character.isLowerCase(c)) {
					minuscula++;
					
				}else if(c != '_') {
					return false;
				}
			}
		
		
		if(mayuscula<2 || minuscula<3 || numero<2) {
			return false;
		}
		}
		return true; 
				
	}
	
	
}

