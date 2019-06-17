package pe.com.sov.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.sov.Dao.ProductoDao;
import pe.com.sov.DaoImp.ProductoDaoImp;
import pe.com.sov.Entity.Producto;


/**
 * Servlet implementation class ProductoController
 */
@WebServlet("/pd")
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoDao pd = new ProductoDaoImp();
	private Gson g = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//System.out.println(request.getParameter("opc"));
		int op = Integer.parseInt(request.getParameter("opc"));
		int x = 0;
		switch (op) {
		
		case 1: x = pd.create(new Producto(1,request.getParameter("nombre"),request.getParameter("codigo"),request.getParameter("descripcion"),
				Double.parseDouble(request.getParameter("precio")),request.getParameter("caducidad")), Integer.parseInt(request.getParameter("categoria")),Integer.parseInt(request.getParameter("stock")));
		out.println("Registro guardado correctamente..!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
