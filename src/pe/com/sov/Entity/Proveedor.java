package pe.com.sov.Entity;

public class Proveedor {
	private	int idproveedor;
	private	String nombre;
	private	String telefono;
	private	String correo;
	private	String direccion;
	private	String ruc;
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proveedor(int idproveedor, String nombre, String telefono, String correo, String direccion, String ruc) {
		super();
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.ruc = ruc;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
}

