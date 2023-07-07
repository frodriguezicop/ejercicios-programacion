package resol.Parcial1.ApellidoN;

public class Empleados extends Persona {
	
	public Empleados(String apellido, String nombre, int dni, String fecha_nacimiento, String genero,
			Domicilio domicilio, int nroLegajo, String fecha_inicio, String cargo) {
		super(apellido, nombre, dni, fecha_nacimiento, genero, domicilio);
		this.nroLegajo = nroLegajo;
		this.fecha_inicio = fecha_inicio;
		this.cargo = cargo;
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
	
	
}
