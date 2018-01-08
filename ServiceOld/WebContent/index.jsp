<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社区居家养老服务信息系统</title>
</head>
<body>
	<div>
		<h3 align="center">管理员登陆</h3>
		<form name="loginForm" method="post" action="AdminLogin">
			<p align="center">
				<label>用户名：</label>
				<input type="text" name="textAdminName">
			</p>
			<p align="center">
				<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
				<input type="password" name="textAdminPSW">
			</p>
			<p align="center">
				<input type="submit" value="登陆">
			</p>
		</form>
	</div>
</body>
</html>