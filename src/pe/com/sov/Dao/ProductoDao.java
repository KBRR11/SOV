package pe.com.sov.Dao;

import java.util.List;
import java.util.Map;

import pe.com.sov.Entity.Producto;



public interface ProductoDao {
	public int create(Producto u);
	public int update(Producto u);
	public int delete(int id);
	public Producto read(int id);
	public List<Map<String, Object>> readAll();
}
