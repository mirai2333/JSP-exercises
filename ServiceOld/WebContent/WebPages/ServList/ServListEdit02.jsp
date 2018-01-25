<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="table.servlist.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>工单完成</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 520px;
	height: 591px;
	z-index: 1;
}
</style>
</head>

<body>
<div id="apDiv1">
  <p align="center">工单完成</p>
  <form id="form1" name="form1" method="post" action="<%=request.getContextPath()%>/ServListEdit02">
  <% 
  	ServList s = (ServList)request.getAttribute("servlist");
  	String feeOk = s.getSLfeeOk();
  	String level = s.getSLlevel();
  %>
  
    <p>工单编号：<input type="text" name="SLid" id="textfield" value="<%=s.getSLid()%>"/></p>
    <p>社工姓名：<input type="text" name="SRname" id="textfield2" value="<%=s.getSRname()%>"/></p>
    <p>服务开始时间：<input type="text" name="SLstartTime" id="textfield3" value="<%=s.getSLstartTime()%>"/></p>
    <p>服务结束时间：<input type="text" name="SLcloseTime" id="textfield4" value="<%=s.getSLcloseTime()%>"/></p>
    <p>老人姓名：<input type="text" name="OMname" id="textfield5" value="<%=s.getOMname()%>"/></p>
    <p>服务内容：<input type="text" name="SLcontent" id="textfield6" value="<%=s.getSLcontent()%>"/></p>
    <p>服务费用：<input type="text" name="SLfee" id="textfield7" value="<%=s.getSLfee()%>"/></p>
    <p>是否缴费：
      <input type="radio" name="SLfeeOk" value="已缴" id="RadioGroup1_0"
      <% if(feeOk.equals("已缴"))out.print("checked");%>/>已缴
      <input type="radio" name="SLfeeOk" value="未缴" id="RadioGroup1_1"
	  <% if(feeOk.equals("未缴"))out.print("checked");%>/>未缴
    </p>
    <p>服务质量评价：<br />
		<input type="radio" name="SLlevel" value="良好" id="RadioGroup2_0"
		<% if(level.equals("良好"))out.print("checked");%>/>良好
		<input type="radio" name="SLlevel" value="一般" id="RadioGroup2_1"
		<% if(level.equals("一般"))out.print("checked");%>/>一般
		<input type="radio" name="SLlevel" value="不合格" id="RadioGroup2_2"
		<% if(level.equals("不合格"))out.print("checked");%>/>不合格
    </p>
    <p align="center">
      <input type="submit" name="button" id="button" value="提交" />
    </p>
  </form>
</div>
</body>
</html>