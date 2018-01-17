<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="table.socialer.Socialer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>社工信息变更</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 332px;
	height: 591px;
	z-index: 1;
	left: 14px;
}
</style>
</head>

<body>
<div id="apDiv1">
  <p align="center">社工信息变更</p>
  <form id="form1" name="form1" method="post" action="<%=request.getContextPath()%>/SocialerEdit02">
  <% Socialer socialer = (Socialer)request.getAttribute("socialer"); %>
    <p>社工编号：<input type="text" name="SRid" id="textfield" value="<%=socialer.getSRid()%>" /></p>
    <p>社工姓名：<input type="text" name="SRname" id="textfield2" value="<%=socialer.getSRname()%>" /></p>
    <p>社工性别：
      <input type="radio" name="SRsex" value="男" id="RadioGroup1_0" 
      <% if(socialer.getSRsex().equals("男"))out.print("checked"); %>/>男
      <input type="radio" name="SRsex" value="女" id="RadioGroup1_1"
      <% if(socialer.getSRsex().equals("女"))out.print("checked"); %>/>女
    </p>
    <p>身份证号码：<input type="text" name="SRidNum" id="textfield3" value="<%=socialer.getSRidNum()%>"/></p>
    <p>籍贯：<input type="text" name="SRhome" id="textfield4" value="<%=socialer.getSRhome()%>"/></p>
    <p>住址：<input type="text" name="SRaddr" id="textfield5" value="<%=socialer.getSRaddr()%>"/></p>
    <p>电话：<input type="text" name="SRtel" id="textfield6" value="<%=socialer.getSRtel()%>"/></p>
    <p>工作性质：
      <input type="radio" name="SRsort" value="社工" id="RadioGroup2_0" 
      <% if(socialer.getSRsort().equals("社工"))out.print("checked"); %>/>社工
      <input type="radio" name="SRsort" value="义工" id="RadioGroup2_1"
      <% if(socialer.getSRsort().equals("义工"))out.print("checked"); %>/>义工
    </p>
    <p>月薪：<input type="text" name="SRsalary" id="textfield7" value="<%=socialer.getSRsalary()%>"/></p>
    <p>就业日期：<input type="text" name="SRstarDate" id="textfield8" value="<%=socialer.getSRstarDate() %>" /></p>
    <p>星级：<input type="text" name="SRlevel" id="textfield9" value="<%=socialer.getSRlevel()%>"/></p>
    <p align="center">
    	<input type="submit" name="button" id="button" value="提交" />
    </p>
  </form>
</div>
</body>
</html>