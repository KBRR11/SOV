package pe.com.sov.Entity;

public class Acceso {
	int idacceso;
	String usuario;
	String contrase�a;
	int idempleado;
	public Acceso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acceso(int idacceso, String usuario, String contrase�a, int idempleado) {
		super();
		this.idacceso = idacceso;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	
}

