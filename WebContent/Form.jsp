<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/JoinController" method="POST">
	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th>PWD</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<th>Address</th>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<th>ȸ������</th>
			<td><input type="radio" name="type" value="1">�Ǹ���
			<input type="radio" name="type" value="2">������</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="����">
			<input type="reset" value="���"></td>
		</tr>
	</table>
</form>
</body>
</html>