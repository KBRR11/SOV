package pe.com.sov.Entity;

public class Producto {
	private	int idproducto;
	private	String nombre;
	private	String producto_codigo;
	private	String descripcion;
	private	Double precio_venta;
	private	String caducidad;
	private	int idcategoria;
	private	int idstock;

	public Producto(int idproducto, String nombre, String producto_codigo, String descripcion, Double precio_venta,
			String caducidad, int idcategoria, int idstock) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.producto_codigo = producto_codigo;
		this.descripcion = descripcion;
		this.precio_venta = precio_venta;
		this.caducidad = caducidad;
		this.idcategoria = idcategoria;
		this.idstock = idstock;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProducto_codigo() {
		return producto_codigo;
	}

	public void setProducto_codigo(String producto_codigo) {
		this.producto_codigo = producto_codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdstock() {
		return idstock;
	}

	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}


	}
