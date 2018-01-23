<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script src="SpryAssets/SpryAccordion.js" type="text/javascript"></script>
<link href="SpryAssets/SpryMenuBarVertical.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryAccordion.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div id="Accordion1" class="Accordion">
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">老年客户管理</div>
    <div class="AccordionPanelContent">
      <a href="OldmanPre" target="mainFrame">客户信息登记</a>
      <br>
      <a href="oldmanEdit01.jsp" target="mainFrame">客户信息变更</a>
    </div>
  </div>
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">社区工作人员管理</div>
    <div class="AccordionPanelContent">
      <a href="SocialerPre" target="mainFrame">社工信息登记</a>
      <br>
      <a href="WebPages/Socialer/socialerEdit01.jsp" target="mainFrame">社工信息变更</a>
    </div>
  </div>
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">工单管理</div>
    <div class="AccordionPanelContent">
      <a href="ServListPre" target="mainFrame">工单生成</a>
      <br>
      <a href="WebPages/ServList/ServListEdit01.jsp" target="mainFrame">工单完成</a>
      <br>
      <a href="#" target="mainFrame">工单查询</a>
    </div>
  </div>
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">信息查询与统计</div>
    <div class="AccordionPanelContent">
      <a href="#" target="mainFrame">客户费用清单</a>
      <br>
      <a href="#" target="mainFrame">其他查询</a>
    </div>
  </div>
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">信息发布与维护</div>
    <div class="AccordionPanelContent">
      <a href="#" target="mainFrame">信息发布</a>
      <br>
      <a href="#" target="mainFrame">信息维护</a>
    </div>
  </div>
  <div class="AccordionPanel">
    <div class="AccordionPanelTab">系统管理</div>
    <div class="AccordionPanelContent">
      <a href="Logout?logoutId=1">退出系统</a>
      <br>
      <a href="Logout?logoutId=2">重新登陆</a>
    </div>
  </div>
</div>
<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
var Accordion1 = new Spry.Widget.Accordion("Accordion1");
</script>
</body>
</html>