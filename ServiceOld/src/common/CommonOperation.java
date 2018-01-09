package common;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import table.oldman.Oldman;

public class CommonOperation {
	public Oldman getRequestMessageOfOldman(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		return oldman;
	}
	
}
