package pe.com.sov.Entity;

public class Almacen {
	int idalmacen;
	int precio_costo;
	String producto_codigo;
	public Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Almacen(int idalmacen, int precio_costo, String producto_codigo) {
		super();
		this.idalmacen = idalmacen;
		this.precio_costo = precio_costo;
		this.producto_codigo = producto_codigo;
	}
	public int getIdalmacen() {
		return idalmacen;
	}
	public void setIdalmacen(int idalmacen) {
		this.idalmacen = idalmacen;
	}
	public int getPrecio_costo() {
		return precio_costo;
	}
	public void setPrecio_costo(int precio_costo) {
		this.precio_costo = precio_costo;
	}
	public String getProducto_codigo() {
		return producto_codigo;
	}
	public void setProducto_codigo(String producto_codigo) {
		this.producto_codigo = producto_codigo;
	}
	
}

