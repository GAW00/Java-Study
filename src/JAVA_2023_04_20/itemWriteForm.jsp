<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="itemWriteResult.jsp">
			<h1>정보 입력 폼</h1>
			상품명 <input type="text" name="name"><br>
			가격 <input type="number" name="price"><br>
			설명 <textarea rows="10" cols="65" name="description"></textarea>
			<center>
				<input type="submit" value="전송">
				<input type="reset" value="취소">
			</center>
		</form>
	</body>
</html>