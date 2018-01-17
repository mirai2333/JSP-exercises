package action.socialer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.socialer.Socialer;
import table.socialer.SocialerHandle;

/**
 * Servlet implementation class SocialerEdit01
 */
@WebServlet("/SocialerEdit01")
public class SocialerEdit01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocialerEdit01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SocialerHandle socialerHandle = new SocialerHandle();
		String SRid = request.getParameter("SRid");
		Socialer socialer = socialerHandle.searchSocialerById(SRid);
		
		if(socialer != null) {
			request.setAttribute("socialer", socialer);
			request.getRequestDispatcher("WebPages/Socialer/socialerEdit02.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("WebPages/Socialer/socialerEdit01.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
