package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Agregar
 */
@WebServlet("/Agregar")
public class Agregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Agregar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		HttpSession sesion = request.getSession();
		ArrayList<String> alumnos = new ArrayList<>();
		if(sesion.getAttribute("nombre")!=null) {
			alumnos = (ArrayList<String>)sesion.getAttribute("nombre");
			alumnos.add(nombre);
			sesion.setAttribute("nombre", alumnos);
		}else {
			alumnos.add(nombre);
			sesion.setAttribute("nombre", alumnos);
		}
		RequestDispatcher rd = request.getRequestDispatcher("nombres.jsp");
		rd.forward(request, response);
	}

}
