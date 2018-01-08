<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>老年客户信息变更</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 381px;
	height: 486px;
	z-index: 1;
	left: 400px;
}
</style>
</head>

<body>
<div id="apDiv1">
  <h2 align="center">老年客户信息变更</h2>
  <form id="form1" name="form1" method="post" action="OldmanAdd">
    <p>老人编号：<input type="text" name="OMid" id="textfield" value="<%=request.getAttribute("OMid")%>" /></p>
    <p>老人姓名：<input type="text" name="OMname" id="textfield2" value="<%=request.getAttribute("OMname")%>"/></p>
    <p> 老人性别：
        <input type="radio" name="OMsex" value="男" id="RadioGroup1_0"
         	<%if(request.getAttribute("OMsex").equals("男"))out.print("checked"); %>
        />男
        <input type="radio" name="OMsex" value="女" id="RadioGroup1_1"
        	<%if(request.getAttribute("OMsex").equals("女"))out.print("checked"); %>
        />女
    </p>
    <p>老人身份证号码：<input type="text" name="OMidNum" id="textfield4" value="<%=request.getAttribute("OMidNum")%>"/></p>
    <p>老人籍贯：<input type="text" name="OMhome" id="textfield5" value="<%=request.getAttribute("OMhome")%>"/></p>
    <p>老人地址：<input type="text" name="OMaddr" id="textfield8" value="<%=request.getAttribute("OMaddr")%>"/></p>
    <p>老人电话：<input type="text" name="OMtel1" id="textfield6" value="<%=request.getAttribute("OMtel1")%>"/></p>
    <p>亲人电话：<input type="text" name="OMtel2" id="textfield7" value="<%=request.getAttribute("OMtel2")%>"/></p>
    <p>照料性质：
        <input type="radio" name="OMsort" value="收费" id="RadioGroup2_0"
        		<%if(request.getAttribute("OMsort").equals("收费"))out.print("checked");%>
		/>收费
        <input type="radio" name="OMsort" value="免费" id="RadioGroup2_1"
				<%if(request.getAttribute("OMsort").equals("免费"))out.print("checked");%>
		/>免费
    </p>
    <p align="center">
      <input type="submit" name="button" id="button" value="提交" />
    </p>
  </form>
</div>
</body>
</html>
