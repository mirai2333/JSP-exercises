<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>工单完成</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 337px;
	height: 289px;
	z-index: 1;
	left: 9px;
	top: 11px;
}
</style>
</head>

<body>
<div id="apDiv1">
  <p align="center">工单完成</p>
  <form id="form1" name="form1" method="post" action="<%=request.getContextPath()%>/ServListEdit01">
    <p>工单编号：<input type="text" name="SLid" id="textfield" /></p>
    <p align="center"><input type="submit" name="button" id="button" value="提交" /></p>
  </form>
</div>
</body>
</html>