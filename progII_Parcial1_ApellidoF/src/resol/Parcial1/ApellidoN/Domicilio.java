package resol.Parcial1.ApellidoN;

import java.util.HashMap;

public class Domicilio {
	private String calle;
	private int numero;
	private String barrio;
	private int clave;
	
	public Domicilio(String calle, int numero, String barrio, int clave) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
		this.clave = clave;
		HashMap<Integer, Domicilio> lista = new HashMap<>();
		
		Domicilio d1 = new Domicilio("Cordoba", 1138, "Sur", 347);
		Domicilio d2 = new Domicilio("Avellaneda", 1967, "Norte", 222);
		
		lista.put(1, d1);
		lista.put(2, d2);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}



}
