package action.servlist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.servlist.ServList;
import table.servlist.ServListHandle;

/**
 * Servlet implementation class ServListEdit01
 */
@WebServlet("/ServListEdit01")
public class ServListEdit01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServListEdit01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String SLid = request.getParameter("SLid");
		ServListHandle servlistHandle = new ServListHandle();
		ServList servlist = servlistHandle.searchServListById(SLid);
		
		if(servlist != null) {
			request.setAttribute("servlist", servlist);
			request.getRequestDispatcher("WebPages/ServList/ServListEdit02.jsp").forward(request, response);
		}else
			request.getRequestDispatcher("WebPages/ServList/ServListEdit01.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
