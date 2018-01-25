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
 * Servlet implementation class ServListInpuire
 */
@WebServlet("/ServListInquire")
public class ServListInquire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServListInquire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String SRname = request.getParameter("SRname");
		String OMname = request.getParameter("OMname");
		String where = "1=1";
		if(SRname!="")
			where += " and SRname='"+SRname+"'";
		if(OMname!="")
			where += " and OMname='"+OMname+"'";
		ServListHandle servlisthandle = new ServListHandle();
		ServList[] servlists = servlisthandle.queryByConditions(where);
		
		if(servlists != null)
			request.setAttribute("servlists", servlists);
		request.getRequestDispatcher("WebPages/ServList/ServListInquire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
