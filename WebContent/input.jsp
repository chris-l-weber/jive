<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	div.item {
   	margin-top: 3px;
	margin-bottom: 3px;
   	padding-top: 5px;
	padding-bottom: 5px;
	padding-right: 5px;
	padding-left: 5px;
	background-color: aqua;
	width: 200px;
	border-style: solid;
	}
</style>
	
<title>OS listing Input</title>
</head>
<body>
	<s:form action="add" method="post">
      <s:textfield name="name" label="Name" size="20" />
      <s:textfield name="version" label="Version" size="20" />
      <s:textfield name="notes" label="notes" size="50" />
      <s:submit name="submit" label="Submit" align="center" />
   </s:form>
<div class = item onclick="location.href='index'"> back </div>
</body>
</html>