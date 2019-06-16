package pe.com.sov.Entity;

public class Detalle_venta {
	private	int iddetalle_venta;
	private	int cantidad;
	private	int importe;
	private	int idempleado;
	private	int idventa;
	private	String producto_codigo;
	public Detalle_venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle_venta(int iddetalle_venta, int cantidad, int importe, int idempleado, int idventa,
			String producto_codigo) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.cantidad = cantidad;
		this.importe = importe;
		this.idempleado = idempleado;
		this.idventa = idventa;
		this.producto_codigo = producto_codigo;
	}
	public int getIddetalle_venta() {
		return iddetalle_venta;
	}
	public void setIddetalle_venta(int iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public String getProducto_codigo() {
		return producto_codigo;
	}
	public void setProducto_codigo(String producto_codigo) {
		this.producto_codigo = producto_codigo;
	}
	
}
