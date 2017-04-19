<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Validate</title>
</head>
<body>
<%!
String username, password;
%>
<%
username = request.getParameter("auth_user");
password = request.getParameter("auth_key");
try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","secure");
    PreparedStatement statement = connection.prepareStatement("select * from login where username=? and password=?");
    statement.setString(1, username);
    statement.setString(2, password);
    ResultSet rs = statement.executeQuery();
    if(rs.next()) {
        out.println("Login Success");
    } else {
        out.println("Login Error");
    }
    rs.close();
    statement.close();
    connection.close();
} catch(Exception e) {
    e.printStackTrace();
}
%>
Username : <%= username %><br>
Password : <%= password %>
</body>
</html>