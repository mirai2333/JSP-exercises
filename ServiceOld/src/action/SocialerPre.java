package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.socialer.SocialerHandle;

/**
 * Servlet implementation class SocialerPre
 */
@WebServlet("/SocialerPre")
public class SocialerPre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocialerPre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SocialerHandle socialerHandle = new SocialerHandle();
		String SRid = socialerHandle.MaxSocialerId();
		
		//此处需要一个返回社工最大编号的函数
		if(SRid != null) 
			SRid = String.valueOf(Integer.valueOf(SRid)+1);
		else
			SRid = "1";
		
		request.setAttribute("SRid", SRid);
		request.getRequestDispatcher("socialerAdd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
