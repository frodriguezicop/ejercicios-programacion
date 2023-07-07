package resol.Parcial1.ApellidoN;
import java.util.Scanner;
public class Persona {
	
	public Persona(String apellido, String nombre, int dni, String fecha_nacimiento, String genero,
			Domicilio domicilio) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
		this.genero = genero;
		this.domicilio = domicilio;
	}
	private String apellido;
	private String nombre;
	private int dni;
	private String fecha_nacimiento;
	private String genero;
	private Domicilio domicilio;
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	Scanner scanner = new Scanner(System.in);
	
	public void ingresarPersona() {
		System.out.println("Ingresar Apellido De la Persona");
		apellido = scanner.next();
		
		System.out.println("Ingresar Nombre De la Persona");
		nombre = scanner.next();
		
		System.out.println("Ingresar DNI De la Persona");
		dni = scanner.nextInt();
		
		System.out.println("Ingresar Fecha de Nacimiento De la Persona");
		fecha_nacimiento = scanner.next();
		
		System.out.println("Ingresar Genero De la Persona");
		genero = scanner.next();
		
		System.out.println("Ingresar Domicilio De la Persona");
		
		
		
	}
	
}
