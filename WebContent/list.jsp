<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OS Listing</title>
<style>
table {
	width: 80%;
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid black;
}
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
<table>
<tr>
<th> OS Name</th>
<th> Version </th>
<th> Notes </th>
</tr>
 <%
List l=(List)request.getAttribute("disp");
if(l!=null)
{
 
Iterator it=l.iterator();
 
while(it.hasNext())
{
 
com.chrisweber.jive.OsData b=(com.chrisweber.jive.OsData)it.next();
String tempName = b.getName();
String tempVersion = b.getVersion();
String tempNotes = b.getNote();
 
%>
<tr>

<td><%= tempName %></td>
<td><%= tempVersion %></td>
<td><%= tempNotes %></td>

</tr>
 
<%
 
}
}
 
%>

</table>
<div class = item onclick="location.href='../'"> back </div>
</body>
</html>