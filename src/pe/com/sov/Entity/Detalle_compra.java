package pe.com.sov.Entity;

public class Detalle_compra {
	private	int iddetalle_compra;
	private	int cantidad;
	private	int costo_general;
	private	String producto_codigo;
	private	int idcompra;
	public Detalle_compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle_compra(int iddetalle_compra, int cantidad, int costo_general, String producto_codigo, int idcompra) {
		super();
		this.iddetalle_compra = iddetalle_compra;
		this.cantidad = cantidad;
		this.costo_general = costo_general;
		this.producto_codigo = producto_codigo;
		this.idcompra = idcompra;
	}
	public int getIddetalle_compra() {
		return iddetalle_compra;
	}
	public void setIddetalle_compra(int iddetalle_compra) {
		this.iddetalle_compra = iddetalle_compra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCosto_general() {
		return costo_general;
	}
	public void setCosto_general(int costo_general) {
		this.costo_general = costo_general;
	}
	public String getProducto_codigo() {
		return producto_codigo;
	}
	public void setProducto_codigo(String producto_codigo) {
		this.producto_codigo = producto_codigo;
	}
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}
	
}

