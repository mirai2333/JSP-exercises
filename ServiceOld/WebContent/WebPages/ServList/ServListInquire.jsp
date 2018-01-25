<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="table.servlist.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>工单查询</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 1002px;
	height: 704px;
	z-index: 1;
	left: 1px;
	top: 13px;
}
</style>
</head>

<body>
<div id="apDiv1">
  <p align="center">工单查询</p>
  <form id="form1" name="form1" method="post" action="<%=request.getContextPath()%>/ServListInquire">
    <div align="center">
      <p>
      	社工姓名：<input type="text" name="SRname" id="textfield" />
		老人姓名：<input type="text" name="OMname" id="textfield2" />
        <input type="submit" name="button" id="button" value="查询" />
      </p>
    </div>
  </form>
  <table width="1000" height="37" border="1">
    <tr>
      <th scope="col">工单编号</th>
      <th scope="col">社工姓名</th>
      <th scope="col">工单开始时间</th>
      <th scope="col">工单结束时间</th>
      <th scope="col">老人姓名</th>
      <th scope="col">服务内容</th>
      <th scope="col">服务费用</th>
      <th scope="col">是否缴费</th>
      <th scope="col">服务评价</th>
    </tr>
    <%
    	ServList[] servlists = (ServList[])request.getAttribute("servlists");
    	if(servlists != null){
        	for(ServList sl : servlists){
        		String p = "<tr>"+
        			      "<td>"+sl.getSLid()+"</td>"+
        			      "<td>"+sl.getSRname()+"</td>"+
        			      "<td>"+sl.getSLstartTime()+"</td>"+
        			      "<td>"+sl.getSLcloseTime()+"</td>"+
        			      "<td>"+sl.getOMname()+"</td>"+
        			      "<td>"+sl.getSLcontent()+"</td>"+
        			      "<td>"+sl.getSLfee()+"</td>"+
        			      "<td>"+sl.getSLfeeOk()+"</td>"+
        			      "<td>"+sl.getSLlevel()+"</td>"+
        			    "</tr>";
        		out.print(p);
        	}
    	}
    %>
  </table>
</div>
</body>
</html>