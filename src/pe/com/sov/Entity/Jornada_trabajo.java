package pe.com.sov.Entity;

public class Jornada_trabajo {
	int idregistro;
	String hora_entrada;
	String hora_salida;
	int idacceso;
	public Jornada_trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jornada_trabajo(int idregistro, String hora_entrada, String hora_salida, int idacceso) {
		super();
		this.idregistro = idregistro;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.idacceso = idacceso;
	}
	public int getIdregistro() {
		return idregistro;
	}
	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}
	public String getHora_entrada() {
		return hora_entrada;
	}
	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public String getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}
	public int getIdacceso() {
		return idacceso;
	}
	public void setIdacceso(int idacceso) {
		this.idacceso = idacceso;
	}
	
}

