package Principal;
import Entidad.Rectangulo;
public class ConstructorRectangulo {

	public static void main(String[] args) {
		
		Rectangulo miRectangulo = new Rectangulo();
		
		miRectangulo.crearRectangulo();
		double superficie = miRectangulo.calcularSuperficie();
		double perimetro = miRectangulo.calcularPerimetro();
		
		System.out.println("Superficie del rectangulo: "+superficie);
		System.out.println("Perimetro del rectangulo: "+perimetro);
		System.out.println("Dibujo del rectangulo: ");
		miRectangulo.dibujarRectangulo();
		
	}

}
