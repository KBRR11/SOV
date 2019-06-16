package pe.com.sov.Entity;

public class Venta {
	private	int idventa;
	private	String fecha_venta;
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Venta(int idventa, String fecha_venta) {
		super();
		this.idventa = idventa;
		this.fecha_venta = fecha_venta;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public String getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
}
