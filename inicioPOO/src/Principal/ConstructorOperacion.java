package Principal;
import Entidad.Operacion;
public class ConstructorOperacion {

	public static void main(String[] args) {
		
		Operacion miOperacion = new Operacion();
		
		
		miOperacion.crearOperacion();
		int resultadoSuma=miOperacion.metodoSumar();
		int resultadoResta=miOperacion.metodoRestar();
		int resultadoMultiplicar=miOperacion.metodoMultiplicar();
		int resultadoDividir=miOperacion.metodoDividir();
		
		System.out.println("Suma: "+resultadoSuma);
		
		System.out.println("Resta: "+resultadoResta);
		
		System.out.println("Multiplicar: "+resultadoMultiplicar);
		
		System.out.println("Dividir: "+resultadoDividir);
	}

}
