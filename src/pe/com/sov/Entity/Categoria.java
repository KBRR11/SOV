package pe.com.sov.Entity;

public class Categoria {
	private	int idcategoria;
	private String nombre;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int idcategoria, String nombre) {
		super();
		this.idcategoria = idcategoria;
		this.nombre = nombre;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//KBRR11
}
