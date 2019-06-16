package pe.com.sov.Entity;

public class Empleado {
	int idempleado;
	String nombres;
	String apellidos;
	String sexo;
	String estado;
	String telefono;
	String direccion;
	String fechaini;
	String fechafin;
	int idrol;
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(int idempleado, String nombres, String apellidos, String sexo, String estado, String telefono,
			String direccion, String fechaini, String fechafin, int idrol) {
		super();
		this.idempleado = idempleado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.estado = estado;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fechaini = fechaini;
		this.fechafin = fechafin;
		this.idrol = idrol;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaini() {
		return fechaini;
	}
	public void setFechaini(String fechaini) {
		this.fechaini = fechaini;
	}
	public String getFechafin() {
		return fechafin;
	}
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	
}
