package action.servlist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.CommonOperation;
import table.servlist.ServList;
import table.servlist.ServListHandle;

/**
 * Servlet implementation class ServListEdit02
 */
@WebServlet("/ServListEdit02")
public class ServListEdit02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServListEdit02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CommonOperation commonoperation = new CommonOperation();
		ServList servlist = commonoperation.getRequestMessageOfServList(request);
		ServListHandle servlisthandle = new ServListHandle();
		
		if(servlisthandle.modifyServListMessage(servlist))
			request.getRequestDispatcher("addSuccess.jsp").forward(request, response);
		else
			request.getRequestDispatcher("addFail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
