package action;

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
 * Servlet implementation class SocialerAdd
 */
@WebServlet("/SocialerAdd")
public class SocialerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocialerAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取提交信息到socialer对象
		CommonOperation commonOperation = new CommonOperation();
		Socialer socialer = commonOperation.getRequestMessageOfSocialer(request);
		//插入到数据库
		SocialerHandle socialerHandle = new SocialerHandle();
		if(socialerHandle.save(socialer))
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
