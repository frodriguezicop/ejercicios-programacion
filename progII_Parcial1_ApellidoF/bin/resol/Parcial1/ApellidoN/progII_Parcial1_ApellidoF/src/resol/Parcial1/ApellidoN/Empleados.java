package resol.Parcial1.ApellidoN;
import java.util.Scanner;
public class Empleados extends Persona {
	
	public Empleados(String apellido, String nombre, int dni, String fecha_nacimiento, String genero,
			Domicilio domicilio, int nroLegajo, String fecha_inicio, String cargo) {
		super(apellido, nombre, dni, fecha_nacimiento, genero, domicilio);
		this.nroLegajo = nroLegajo;
		this.fecha_inicio = fecha_inicio;
		this.cargo = cargo;
	}
	
	public Empleados() {
		super();
	}

	private int nroLegajo;
	private String fecha_inicio;
	private String cargo;
	public int getNroLegajo() {
		return nroLegajo;
	}
	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void ingresarEmpleado() {
		Scanner scanner = new Scanner(System.in);
		
		
		
			System.out.println("Ingresar Empleado");
			System.out.println("Ingresar Numero de Legajo");
				nroLegajo = scanner.nextInt();
			System.out.println("Ingresar Fecha de Inicio");
				fecha_inicio = scanner.next();
			System.out.println("Ingresar Cargo (Administrativo, Especializado, Directivo o Agente Afiliador.");
				cargo = scanner.next();
		
		
		
	}
	
	
}
