<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<%
	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	String description = request.getParameter("description");
	int re = -1;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql = "INSERT INTO ITEM VALUES(?, ?, ?)";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, price);
		pstmt.setString(3, description);
		
		re = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	} catch (Exception e) {
		System.out.println("오류발생");
		e.printStackTrace();
	}
%>
<a href="itemWrite.jsp">결과보기</a>
