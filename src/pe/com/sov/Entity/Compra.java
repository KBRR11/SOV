package pe.com.sov.Entity;

public class Compra {
	private	int idcompra;
	private	int cantidad;
	private	String fecha_pedido;
	private	String fecha_entrega;
	private	int idproveedor;
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compra(int idcompra, int cantidad, String fecha_pedido, String fecha_entrega, int idproveedor) {
		super();
		this.idcompra = idcompra;
		this.cantidad = cantidad;
		this.fecha_pedido = fecha_pedido;
		this.fecha_entrega = fecha_entrega;
		this.idproveedor = idproveedor;
	}
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	
}
