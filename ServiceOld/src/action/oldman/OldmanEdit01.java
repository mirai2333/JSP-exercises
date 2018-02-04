package action.oldman;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.oldman.Oldman;
import table.oldman.OldmanHandle;

/**
 * Servlet implementation class OldmanEdit01
 */
@WebServlet("/OldmanEdit01")
public class OldmanEdit01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OldmanEdit01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String OMid = request.getParameter("OMid");
		OldmanHandle oldmanHandle = new OldmanHandle();
		
		Oldman oldman = oldmanHandle.searchOldmanByOMid(OMid);
		
		if(oldman != null) {
			request.setAttribute("Oldman", oldman);
			request.getRequestDispatcher("WebPages/Oldman/oldmanEdit02.jsp").forward(request, response);
		}else
			request.getRequestDispatcher("WebPages/Oldman/oldmanEdit01.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
