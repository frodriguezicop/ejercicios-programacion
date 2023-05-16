package juego;
import java.util.Scanner;
public class javajuego {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		int j1=0;
		int j2=0; 
		int apuesta1=0;
		int apuesta2=0;
		int pozo=0;
		int saldo1=1000;
		int saldo2=1000;
		int chance1 = 10;
		int chance2 = 10;
		boolean bandera = true;
		String doblarapuesta= "";
		int incognita = (int)(Math.random()*(1-100+1)+100);
		System.out.println("Comenzo el juego !!!");
		System.out.println(incognita);							
		while( chance1 != 0 || chance2 != 0 && saldo1 <= 50 && saldo2 <= 50){
			
			System.out.println("jugador 1 coloque un numero del 1 al 100 ");
			j1 = Sc.nextInt();
			while(j1 > 100 ) {
	        	System.out.println("El numero ingresado es mayor al 100");
	        	System.out.println("Ingrese de nuevo un numero");
	        	j1= Sc.nextInt();
			}
			System.out.print("cuanto desea apostar (apuesta min=50) su saldo es = "+saldo1);
	        	apuesta1= Sc.nextInt();
					while(apuesta1 > saldo1) {
						System.out.println("Apueste menos su saldo es de "+ saldo1);
						apuesta1= Sc.nextInt();
	        
						while (apuesta1 < 50) {
							System.out.println("La apuesta minima es de 50");
							apuesta1= Sc.nextInt();
						}
							
			}
			System.out.println("jugador 2 coloque un numero del 1 al 100 ");
			j2 = Sc.nextInt();
			while(j2 > 100 ) {
	        	System.out.println("El numero ingresado es mayor al 100");
	        	System.out.println("Ingrese de nuevo un numero");
	        	j2= Sc.nextInt();
			}
	        	System.out.print("cuanto desea apostar (apuesta min=50) su saldo es "+saldo2);
	        	apuesta2= Sc.nextInt();
					while(apuesta2 > saldo2) {
						System.out.println("Apueste menos su saldo es de "+ saldo2);
						apuesta2= Sc.nextInt();
						while (apuesta2 < 50) {
							System.out.println("La apuesta minima es de 50");
							apuesta2= Sc.nextInt();
						}
							
			}
				
			chance1--;
			System.out.println("Jugador 1, desea doblar la apuesta ??");
	        System.out.println("Presione === Y / N");
	        doblarapuesta=Sc.next();
	        if (doblarapuesta.equalsIgnoreCase("Y") && apuesta1 < (saldo1/2)) {
	        	apuesta1 = apuesta1*2;
	        }else if(doblarapuesta.equalsIgnoreCase("Y") && apuesta1 > (saldo1/2)) {
	        	System.out.println("No se pudo doblar la apuesta por falta de dinero");
	        	
	        }else {
	        	System.out.println("No se doblo la apuesta");
	        	
	        }
	        System.out.println("Apuesta de jugador1= " + apuesta1);
	        saldo1 -= apuesta1;
	        pozo += apuesta1;
	        if (saldo2<50 ) {
	        	System.out.println("El jugador 1 se quedo sin dinero");
				System.out.println("El jugador 2 gano, se lleva el pozo" + pozo);
				break;
			}
	        if (incognita > j1) {
	        	System.out.println("El numero ingresado es menor al aleatorio");
	        	System.out.println("Jugador 2 te quedan "+ chance1 + " intentos ");
	        }else if (incognita < j1) {
	        	System.out.println("El numero ingresador es mayor al aleatorio");
	        	System.out.println("Jugador 2 te quedan "+ chance1 + " intentos ");
	        }else {
	        	System.out.println("El jugador 2 gano el juego!!!. El numero aleatorio es " +incognita);
	        	System.out.println();
	        	System.out.println("Se ha ganado el pozo de "+ pozo);
	        	System.out.println();
	            System.out.println("Cantidad de chances de J1 : " +chance1);
	            System.out.println();
	            System.out.println("Cantidad de chances de J2 : " +chance2);
	            System.out.println();
	            System.out.println("Saldo Final J1 : " +saldo1);
	            System.out.println();
	            System.out.println("Saldo Final J2 : " +saldo2);
	            System.out.println();
	            System.out.println("Ultima apuesta fue de : " +apuesta1);
	            break;
	        }
			
	        
	        chance2--;
			System.out.println("Jugador 2, desea doblar la apuesta ??");
	        System.out.println("Presione === Y / N");
	        doblarapuesta=Sc.next();
	        if (doblarapuesta.equalsIgnoreCase("Y") && apuesta2 < (saldo2/2)) {
	        	apuesta2= apuesta2*2;
	        }else if(doblarapuesta.equalsIgnoreCase("Y") && apuesta2 > (saldo2/2)) {
	        	System.out.println("No se pudo doblar la apuesta por falta de dinero");
	        	
	        }else {
	        	System.out.println("No se doblo la apuesta");
	        	
	        }
	        System.out.println("Apuesta de jugador2 " +apuesta2);
	        saldo2 -= apuesta2;
	        pozo += apuesta2;
		
	        if (saldo2<50 ) {
	        	System.out.println("El jugador 1 se quedo sin dinero");
				System.out.println("El jugador 2 gano, se lleva el pozo" + pozo);
				break;
			}
	        if (incognita > j2) {
	        	System.out.println("El numero ingresado es menor al aleatorio");
	        	System.out.println("Jugador 2 te quedan "+ chance2 + " intentos ");
	        }else if (incognita < j2) {
	        	System.out.println("El numero ingresador es mayor al aleatorio");
	        	System.out.println("Jugador 2 te quedan "+ chance2 + " intentos ");
	        }else {
	        	System.out.println("El jugador 2 gano el juego!!!. El numero aleatorio es " +incognita);
	        	System.out.println();
	        	System.out.println("Se ha ganado el pozo de "+ pozo);
	        	System.out.println();
	            System.out.println("Cantidad de chances de J1 : " +chance1);
	            System.out.println();
	            System.out.println("Cantidad de chances de J2 : " +chance2);
	            System.out.println();
	            System.out.println("Saldo Final J1 : " +saldo1);
	            System.out.println();
	            System.out.println("Saldo Final J2 : " +saldo2);
	            System.out.println();
	            System.out.println("Ultima apuesta fue de : " +apuesta2);
	            break;
		}
		
		}	
}
}

