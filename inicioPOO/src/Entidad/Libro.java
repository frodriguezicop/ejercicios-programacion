package Entidad;
import java.util.Scanner;
public class Libro {
	Scanner scanner = new Scanner(System.in);
	
	private int isbn;
    private String titulo;
    private String autor;
    private int pag;
	
    
    public Libro() {
		super();
	}


	public Libro(int isbn, String titulo, String autor, int pag) {
		super();
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.pag = pag;
	}

	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getPag() {
		return pag;
	}


	public void setPag(int pag) {
		this.pag = pag;
	}
   
    public void cargarLibro() {
    	
    	System.out.println("Ingresar ISBN del libro");
    	int isbn = scanner.nextInt();
    	this.setIsbn(isbn);
    	
    	System.out.println("Ingresar Titulo del Libro");
    	String titulo = scanner.next();
    	this.setTitulo(titulo);
    	
    	System.out.println("Ingresar Autor del Libro");
    	String autor = scanner.next();
    	this.setAutor(autor);
    	
    	System.out.println("Ingresar Numero de Paginas del Libro");
    	int pag = scanner.nextInt();
    	this.setPag(pag);
    	
    }
    
    public void mostrarLibro() {
    	System.out.println("ISBN: "+this.getIsbn());
    	System.out.println("Titulo: "+this.getTitulo());
    	System.out.println("Autor: "+this.getAutor());
    	System.out.println("Numero de Paginas: "+this.getPag());
    	
    }
    
    }
    

