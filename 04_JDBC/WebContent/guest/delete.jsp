<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- (실습) 전달받은 데이터(파라미터값) 사용해서 DB데이터 삭제 처리 
	정상처리후 : list.jsp 이동
	예외발생시 : 현재페이지 보여주기
--%>
<%
	//1.전달받은 파라미터 값 확인(추출)
	int sabun = Integer.parseInt(request.getParameter("sabun"));
	//2. DB 데이터 삭제 처리
	final String DRIVER = "oracle.jdbc.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		//사용할 SQL 쿼리 작성
		String sql = "DELETE FROM GUEST WHERE sabun = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sabun);
		
		pstmt.executeUpdate();
		
		response.sendRedirect("list.jsp");
		
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
	//3. 페이지 이동처리
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외발생</title>
</head>
<body>
	<h1>사원정보 삭제 실패</h1>
	<p>삭제처리를 하지 못했습니다<br>
	담당자(8282)에게 연락하세요</p>
	<a href="detail.jsp?sabun=6666">상세페이지로 이동</a>
	<a href="list.jsp">전체목록 보기</a>
</body>
</html>