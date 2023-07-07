package resol.Parcial1.ApellidoN;

public class Afiliados extends Persona {
	
	private int nroSocio;
	private String fecha_adhesion;
	private String afectacion;
	private String planCobertura;
	private int identificacion;
	
	public Afiliados(String apellido, String nombre, int dni, String fecha_nacimiento, String genero,
			Domicilio domicilio, int nroSocio, String fecha_adhesion, String afectacion, String planCobertura,
			int identificacion) {
		super(apellido, nombre, dni, fecha_nacimiento, genero, domicilio);
		this.nroSocio = nroSocio;
		this.fecha_adhesion = fecha_adhesion;
		this.afectacion = afectacion;
		this.planCobertura = planCobertura;
		this.identificacion = identificacion;
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getFecha_adhesion() {
		return fecha_adhesion;
	}

	public void setFecha_adhesion(String fecha_adhesion) {
		this.fecha_adhesion = fecha_adhesion;
	}

	public String getAfectacion() {
		return afectacion;
	}

	public void setAfectacion(String afectacion) {
		this.afectacion = afectacion;
	}

	public String getPlanCobertura() {
		return planCobertura;
	}

	public void setPlanCobertura(String planCobertura) {
		this.planCobertura = planCobertura;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	




}



