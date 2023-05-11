<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql = "SELECT * FROM ITEM";
%>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<h1>입력 완료된 정보</h1>
		<table border="1" width="80%">
			<tr>
				<th width="15%">상품명</th>
				<th width="20%">가격</th>
				<th width="65%">설명</th>
			</tr>
			<%
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					while(rs.next()){
						%>
							<tr>
								<td><%= rs.getString("NAME") %></td>
								<td><%= rs.getInt("PRICE") %></td>
								<td><%= rs.getString("DESCRIPTION") %></td>
							</tr>
						<%
					}
				} catch(SQLException se) {
					se.printStackTrace();
				} finally {
					try{
						if(rs != null) rs.close();
						if(stmt != null) stmt.close();
						if(conn != null) conn.close();
					}catch(SQLException se){
						se.printStackTrace();
					}
				}
				
			%>
		</table>
	</body>
</html>