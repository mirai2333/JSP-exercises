package action.oldman;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.CommonOperation;
import table.oldman.Oldman;
import table.oldman.OldmanHandle;

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
		CommonOperation commonOperation = new CommonOperation();
		OldmanHandle oldmanHandle = new OldmanHandle();
		Oldman oldman = commonOperation.getRequestMessageOfOldman(request);
		if(oldmanHandle.modifyOldmanMessage(oldman))
			request.getRequestDispatcher("WebPages/ResultPages/addSuccess.jsp").forward(request, response);
		else
			request.getRequestDispatcher("WebPages/ResultPages/addFail.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
