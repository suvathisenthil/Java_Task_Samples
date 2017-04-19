<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="theme.css" type="text/css" />
</head>
<body>
<form action = "update.jsp" method = "get">
<%
String code = request.getParameter("code");
try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","secure");
    PreparedStatement statement = connection.prepareStatement("select * from item where itemcode = ?");
    statement.setString(1, code);
    ResultSet rs = statement.executeQuery();
    if(rs.next()) {
%>
<input type="hidden" name="code" value="<%= rs.getString(1) %>"/>
<table width="768px" class="centered">
<tr>
<td><label for="type">Type</label></td>
<td><input type="text" name="type" id="type" value="<%= rs.getString(2) %>" /> 
</tr>
<tr>
<td><label for="desc">Description</label></td>
<td><input type="text" name="desc" id="desc" value="<%= rs.getString(3) %>" /> 
</tr>
<tr>
<td><label for="price">Price</label></td>
<td><input type="text" name="price" id="price" value="<%= rs.getDouble(4) %>" /> 
</tr>
<tr>
<td><label for="reo">Re-order</label></td>
<td><input type="text" name="reo" id="reo" value="<%= rs.getInt(5) %>" /> 
</tr>
<tr>
<td><label for="qty">Quantity</label></td>
<td><input type="text" name="qty" id="qty" value="<%= rs.getInt(6) %>" /> 
</tr>
<tr>
<td><label for="cat">Category</label></td>
<td><input type="text" name="cat" id="cat" value="<%= rs.getString(7) %>" /> 
</tr>
<tr>
<td>&nbsp;</td>
<td>
<input type="submit" class="btn-large" value="Update it" />
</td>
</tr>
</table>
<%
    }
    rs.close();
    statement.close();
    connection.close();
} catch(Exception e) {
    e.printStackTrace();
}
%>
</form>
</body>
</html>








