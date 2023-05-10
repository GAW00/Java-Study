<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String t_name = request.getParameter("t_name");

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql = "SELECT COLUMN_NAME, DATA_TYPE, DATA_LENGTH, NULLABLE FROM USER_TAB_COLUMNS WHERE TABLE_NAME = ?";
%>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<table border="1" width="400">
			<tr>
				<th>컬럼명</th>
				<th>컬럼형식</th>
				<th>컬럼길이</th>
				<th>널값여부</th>
			</tr>
			<%
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareCall(sql);
					pstmt.setString(1, t_name);
					rs = pstmt.executeQuery();
					
					while(rs.next()){
						%>
							<tr>
								<td><%= rs.getString("COLUMN_NAME") %></td>
								<td><%= rs.getString("DATA_TYPE") %></td>
								<td><%= rs.getInt("DATA_LENGTH") %></td>
								<td><%= rs.getString("NULLABLE") %></td>
							</tr>
						<%
					}
				} catch(SQLException se) {
					se.printStackTrace();
				} finally {
					try{
						if(rs != null) rs.close();
						if(pstmt != null) pstmt.close();
						if(conn != null) conn.close();
					}catch(SQLException se){
						se.printStackTrace();
					}
				}
				
			%>
		</table>
	</body>
</html>