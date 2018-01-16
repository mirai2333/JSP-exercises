<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>社工信息登记</title>
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
  <p align="center">社工信息登记</p>
  <form id="form1" name="form1" method="post" action="SocialerAdd">
    <p>社工编号：<input type="text" name="SRid" id="textfield" value="<%=request.getAttribute("SRid")%>" /></p>
    <p>社工姓名：<input type="text" name="SRname" id="textfield2" /></p>
    <p>社工性别：
      <label><input type="radio" name="SRsex" value="男" id="RadioGroup1_0" />男</label>
      <label><input type="radio" name="SRsex" value="女" id="RadioGroup1_1" />女</label>
    </p>
    <p>身份证号码：<input type="text" name="SRidNum" id="textfield3" /></p>
    <p>籍贯：<input type="text" name="SRhome" id="textfield4" /></p>
    <p>住址：<input type="text" name="SRaddr" id="textfield5" /></p>
    <p>电话：<input type="text" name="SRtel" id="textfield6" /></p>
    <p>工作性质：
      <label><input type="radio" name="SRsort" value="社工" id="RadioGroup2_0" />社工</label>
      <label><input type="radio" name="SRsort" value="义工" id="RadioGroup2_1" />义工</label>
    </p>
    <p>月薪：<input type="text" name="SRsalary" id="textfield7" /></p>
    <p>就业日期：<input type="text" name="SRstarDate" id="textfield8" value="<%=request.getAttribute("SRstarDate") %>" /></p>
    <p>星级：<input type="text" name="SRlevel" id="textfield9" /></p>
    <p align="center">
    	<input type="submit" name="button" id="button" value="提交" />
    </p>
  </form>
</div>
</body>
</html>