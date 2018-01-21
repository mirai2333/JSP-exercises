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
 * Servlet implementation class ServListAdd
 */
@WebServlet("/ServListAdd")
public class ServListAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServListAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取用request传过来的信息
		CommonOperation commonOperation = new CommonOperation();
		ServList servList = commonOperation.getRequestMessageOfServList(request);
		
		//将servlist添加到数据库
		ServListHandle servlistHandle = new ServListHandle();
		if(servlistHandle.save(servList))
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
