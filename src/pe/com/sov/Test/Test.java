package pe.com.sov.Test;

import com.google.gson.Gson;

import pe.com.sov.Dao.ProductoDao;
import pe.com.sov.DaoImp.ProductoDaoImp;
import pe.com.sov.Entity.Producto;

public class Test {
	private static ProductoDao pd = new ProductoDaoImp();
	private static Gson g = new Gson();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//modificar();
		//listar();
		//guardarDVenta();
		add();
		//delete();
	}
	static void add() {
		int x = pd.create(new Producto(1,"Leche Maria","123456","leche deslactosada 1lt",1.0,"hola",1,1));
		System.out.println(x);
	}
}
