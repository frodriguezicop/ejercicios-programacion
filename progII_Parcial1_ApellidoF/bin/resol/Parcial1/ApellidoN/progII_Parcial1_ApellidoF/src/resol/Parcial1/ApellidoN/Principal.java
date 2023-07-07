package resol.Parcial1.ApellidoN;
import resol.Parcial1.ApellidoN.Persona;
import resol.Parcial1.ApellidoN.Empleados;
import java.util.Scanner;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Ingresar ")
		
		
		
		
		
		
		
		
		
		
		Persona miPersona = new Persona();
		miPersona.ingresarPersona();
		
		System.out.println("El Apellido de la persona es "+miPersona.getApellido());
		System.out.println("El Nombre de la persona es "+miPersona.getNombre());
		System.out.println("El DNI de la persona es "+miPersona.getDni());
		System.out.println("La Fecha de Nacimiento de la persona es "+miPersona.getFecha_nacimiento());
		System.out.println("El Genero de la persona es "+miPersona.getGenero());
		System.out.println("El Domicilio de la persona es "+miPersona.getDomicilio());
		
		Empleados miEmpleado = new Empleados();
		miEmpleado.ingresarEmpleado();
		
		System.out.println("El Numero de Legajo del empleado es "+miEmpleado.getNroLegajo());
		System.out.println("La fecha de inicio es "+miEmpleado.getFecha_inicio());
		System.out.println("El cargo es "+miEmpleado.getCargo());
		
		
		
	}

}
