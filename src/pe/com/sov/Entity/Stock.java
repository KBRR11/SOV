package pe.com.sov.Entity;

public class Stock {
	int idstock;
	String nombre;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int idstock, String nombre) {
		super();
		this.idstock = idstock;
		this.nombre = nombre;
	}
	public int getIdstock() {
		return idstock;
	}
	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
