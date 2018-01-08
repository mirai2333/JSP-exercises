package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.oldman.Oldman;

/**
 * Servlet implementation class OldmanEdit02
 */
@WebServlet("/OldmanEdit02")
public class OldmanEdit02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OldmanEdit02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Oldman oldman = (Oldman) request.getAttribute("Oldman");
		request.removeAttribute("Oldman");
		request.setAttribute("OMname", oldman.getOMname());
		request.setAttribute("OMid", oldman.getOMid());
		request.setAttribute("OMsex", oldman.getOMsex());
		request.setAttribute("OMidNum", oldman.getOMidNum());
		request.setAttribute("OMhome", oldman.getOMhome());
		request.setAttribute("OMaddr", oldman.getOMaddr());
		request.setAttribute("OMtel1", oldman.getOMtel1());
		request.setAttribute("OMtel2", oldman.getOMtel2());
		request.setAttribute("OMsort", oldman.getOMsort());
		
		request.getRequestDispatcher("oldmanEdit02.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
