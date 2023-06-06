package Principal;
import Entidad.Libro;
import java.util.Scanner;
public class ConstructorLibro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Libro miLibro = new Libro(1967, "El principito", "FR", 100);
		System.out.println(miLibro.getIsbn());
		System.out.println(miLibro.getTitulo());
		System.out.println(miLibro.getAutor());
		System.out.println(miLibro.getPag());
		
		System.out.println();
		
		Libro unLibro = new Libro();
		unLibro.cargarLibro();
		unLibro.mostrarLibro();
	}

}
