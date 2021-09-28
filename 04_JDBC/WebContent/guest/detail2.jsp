<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 전달받은 사번 값 추출(확인)
	int sabun = Integer.parseInt(request.getParameter("sabun"));
	
	final String DRIVER = "oracle.jdbc.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String name = "";
	Date redate = null;
	int pay = 0;
	
	try {
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);

		//사용할 SQL 쿼리 작성
		String sql = "SELECT SABUN, NAME, REGDATE, PAY ";
		   sql += " FROM GUEST ";
		   sql += "WHERE SABUN = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sabun);
	
		//4. 쿼리실행
		rs = pstmt.executeQuery();
		
		//5. 쿼리 실행 결과에 대한 처리
		if (rs.next()) {
			//rs.getInt("SABUN");
			name = rs.getString("NAME");
			redate = rs.getDate("REGDATE");
			pay = rs.getInt("PAY");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
</head>
<body>
	<h1>상세정보</h1>
		<table border>
			<tr>
				<th>사번</th>
				<td><%=sabun %></td>
			</tr>
			<tr>
				<th>성명</th>
				<td><%=name %></td>
			</tr>
			<tr>
				<th>날짜</th>
				<td><%=redate %></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><%=pay %></td>
			</tr>
		</table>
		<a href="editForm2.jsp?=<%=sabun %>">수정</a>
		<a href="delete2.jsp?sabun=1111">삭제</a>
		<a href="list2.jsp">목록보기</a>
</body>
</html>