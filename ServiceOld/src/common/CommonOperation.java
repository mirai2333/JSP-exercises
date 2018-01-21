package common;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import table.oldman.Oldman;
import table.servlist.ServList;
import table.socialer.Socialer;

public class CommonOperation {
	
	private static final String ENCODE = "UTF-8";
	
	public Oldman getRequestMessageOfOldman(HttpServletRequest request) {
		try {
			request.setCharacterEncoding(ENCODE);
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
	
	public Socialer getRequestMessageOfSocialer(HttpServletRequest request) {
		try {
			request.setCharacterEncoding(ENCODE);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Socialer socialer = new Socialer();
		String temp;
		
		temp = request.getParameter("SRid");
		socialer.setSRid(temp);
		temp = request.getParameter("SRname");
		socialer.setSRname(temp);
		temp = request.getParameter("SRsex");
		socialer.setSRsex(temp);
		temp = request.getParameter("SRidNum");
		socialer.setSRidNum(temp);
		temp = request.getParameter("SRhome");
		socialer.setSRhome(temp);
		temp = request.getParameter("SRaddr");
		socialer.setSRaddr(temp);
		temp = request.getParameter("SRtel");
		socialer.setSRsort(temp);
		temp = request.getParameter("SRsort");
		socialer.setSRsort(temp);
		temp = request.getParameter("SRsalary");
		socialer.setSRsalary(temp);
		temp = request.getParameter("SRstarDate");
		socialer.setSRstarDate(temp);
		temp = request.getParameter("SRlevel");
		socialer.setSRlevel(temp);
		
		return socialer;
	}
	
	public ServList getRequestMessageOfServList(HttpServletRequest request) {
		try {
			request.setCharacterEncoding(ENCODE);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ServList servlist = new ServList();
		String temp;
		
		temp = request.getParameter("SLid");
		servlist.setSLid(temp);
		
		temp = request.getParameter("SRname");
		servlist.setSRname(temp);
		
		temp = request.getParameter("SLstartTime");
		servlist.setSLstartTime(temp);
		
		temp = request.getParameter("SLcloseTime");
		servlist.setSLcloseTime(temp);
		
		temp = request.getParameter("OMname");
		servlist.setOMname(temp);
		
		temp = request.getParameter("SLcontent");
		servlist.setSLcontent(temp);
		
		temp = request.getParameter("SLfee");
		servlist.setSLfee(temp);
		
		temp = request.getParameter("SLfeeOk");
		servlist.setSLfeeOk(temp);
		
		temp = request.getParameter("SLlevel");
		servlist.setSLlevel(temp);
		
		return servlist;
	}
	
}
