package action.servlist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.CurrentDate;
import table.servlist.ServListHandle;

/**
 * Servlet implementation class ServListPre
 */
@WebServlet("/ServListPre")
public class ServListPre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServListPre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String SLid = new ServListHandle().MaxServListId();
		CurrentDate currentdate = new CurrentDate();
		
		if(SLid != null)
			SLid = String.valueOf(Integer.parseInt(SLid)+1);
		else
			SLid = String.valueOf(currentdate.getCurrentDate()) + "001";
		
		request.setAttribute("SLid", SLid);
		request.setAttribute("SLstartTime", new CurrentDate().getCurrentDate());
		request.getRequestDispatcher("WebPages/ServList/ServListAdd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
