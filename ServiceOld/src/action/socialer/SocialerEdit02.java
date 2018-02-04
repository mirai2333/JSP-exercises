package action.socialer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.CommonOperation;
import table.socialer.Socialer;
import table.socialer.SocialerHandle;

/**
 * Servlet implementation class SocialerEdit02
 */
@WebServlet("/SocialerEdit02")
public class SocialerEdit02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocialerEdit02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CommonOperation commonOperation = new CommonOperation();
		Socialer socialer = commonOperation.getRequestMessageOfSocialer(request);
		SocialerHandle socialerHandle = new SocialerHandle();
		
		if(socialerHandle.modifySocialerMessage(socialer))
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
