package pe.com.sov.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
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
		String sql ="INSERT INTO producto (idproducto, nombre, producto_codigo,  precio_venta, caducidad, idcategoria, idstock) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
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
		int x=0;
		String sql= "DELETE FROM producto WHERE idproducto=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			Conexion.cerrar();
		}
		return x;
	}

	@Override
	public Producto read(int id) {
		Producto p =new Producto();
		 String sql = "select * from producto where idproducto = ?";
		 try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				p.setIdproducto(rs.getInt("idproducto"));
				p.setNombre(rs.getString("nombre"));
				p.setProducto_codigo(rs.getString("producto_codigo"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio_venta(rs.getDouble("precio_venta"));
				p.setCaducidad(rs.getString("caducidad"));
				p.setIdcategoria(rs.getInt("idcategoria"));
				p.setIdstock(rs.getInt("idstock"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		 finally {
				Conexion.cerrar();
			}
		 return p;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		List<Map<String, Object>> list = new ArrayList<>();
		String sql = "select  p.idproducto, p.nombre,p.producto_codigo,p.descripcion, p.precio_venta,p.caducidad, c.idcategoria, c.nombre, s.idstock, s.stock "
				+ "from producto as p, categoria as c , stock as s WHERE c.idcategoria = p.idcategoria and s.idstock = p.idstock";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				 Map<String,Object> map= new HashMap<String,Object>();
				map.put("idcategoria", rs.getInt("idcategoria"));
				map.put("nom_categoria", rs.getString("nom_categoria"));
				map.put("idproducto", rs.getInt("idproducto"));
				map.put("nom_producto", rs.getString("nom_producto"));
				map.put("precio", rs.getDouble("precio"));
				map.put("cantidad", rs.getInt("cantidad"));
				list.add(map);
			    
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			Conexion.cerrar();
		}
		return list;
	}

}
