package pe.com.sov.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import pe.com.sov.util.Conexion;


import pe.com.sov.Dao.ProductoDao;
import pe.com.sov.Entity.Producto;

public class ProductoDaoImp implements ProductoDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Producto u) {
		int x = 0;
		String sql ="INSERT INTO producto (idproducto, nombre, producto_codigo,  precio_venta, caducidad, idcategoria, idstock) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getProducto_codigo());
			ps.setDouble(3, u.getPrecio_venta());
			ps.setString(4, u.getCaducidad());
			ps.setInt(5, u.getIdcategoria());
			ps.setInt(6, u.getIdstock());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			Conexion.cerrar();
		}
		return x;
	}
///// OJO CON EL UPDATE
	@Override
	public int update(Producto u) {
		int x = 0;
		String sql = "UPDATE producto Set  nombre=?, producto_codigo=?, precio_venta=?, caducidad=? , idcategoria=?, idstock=? WHERE idproducto=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getProducto_codigo());
			ps.setDouble(3, u.getPrecio_venta());
			ps.setString(4, u.getCaducidad());
			ps.setInt(5, u.getIdcategoria());
			ps.setInt(6, u.getIdstock());
			x = ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			Conexion.cerrar();
		}
		return x;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
