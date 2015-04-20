<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Os version Information System</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
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
</head>
<body>
  <div class='item' onclick="location.href='list'">List OS </div>
  <div class='item' onclick="location.href='add'"> Add to List </div>
</body>
</html>