package pe.com.sov.Entity;

public class Acceso {
	int idacceso;
	String usuario;
	String contraseña;
	int idempleado;
	public Acceso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acceso(int idacceso, String usuario, String contraseña, int idempleado) {
		super();
		this.idacceso = idacceso;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.idempleado = idempleado;
	}
	public int getIdacceso() {
		return idacceso;
	}
	public void setIdacceso(int idacceso) {
		this.idacceso = idacceso;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	
}

