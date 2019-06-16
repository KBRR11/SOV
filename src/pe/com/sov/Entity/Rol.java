package pe.com.sov.Entity;

public class Rol {
	int idrol;
	String nom_rol;
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rol(int idrol, String nom_rol) {
		super();
		this.idrol = idrol;
		this.nom_rol = nom_rol;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNom_rol() {
		return nom_rol;
	}
	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	
}
