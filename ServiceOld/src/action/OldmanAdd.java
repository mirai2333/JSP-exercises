package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.oldman.Oldman;
import table.oldman.OldmanHandle;

/**
 * Servlet implementation class OldmanAdd
 */
@WebServlet("/OldmanAdd")
public class OldmanAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OldmanAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Oldman oldman = new Oldman();
		String temp;
		
		temp = request.getParameter("OMid");
		oldman.setOMid(temp);
		
		temp = request.getParameter("OMname");
		oldman.setOMname(temp);
		
		temp = request.getParameter("OMsex");
		oldman.setOMsex(temp);
		
		temp = request.getParameter("OMidNum");
		oldman.setOMidNum(temp);
		
		temp = request.getParameter("OMhome");
		oldman.setOMhome(temp);
		
		temp = request.getParameter("OMaddr");
		oldman.setOMaddr(temp);
		
		temp = request.getParameter("OMtel1");
		oldman.setOMtel1(temp);
		
		temp = request.getParameter("OMtel2");
		oldman.setOMtel2(temp);
		
		temp = request.getParameter("OMsort");
		oldman.setOMsort(temp);
		
		OldmanHandle oldmanHandle = new OldmanHandle();
		if(oldmanHandle.save(oldman))
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
