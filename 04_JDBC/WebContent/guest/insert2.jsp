<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달받은 데이터를 이용해서 DB에 입력처리
	정상입력 : list.jsp 페이지로 이동
	예외발생 : 현재페이지 오류메시지 보여주기
 --%>
 <%
	//1. 파라미터 값 추출
	int sabun = Integer.parseInt(request.getParameter("sabun"));
	String name = request.getParameter("name");
	int pay = Integer.parseInt(request.getParameter("pay"));
	
	//2. DB 입력 작업
 
    final String DRIVER = "oracle.jdbc.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	 
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//boolean insertSuccess = false;
	
	//사용할 SQL 쿼리 작성
	String sql = "INSERT INTO GUEST VALUES (?, ?, sysdate, ?)";	
	
	try {
		//1. 드라이버 로딩
		Class.forName(DRIVER);
		//2. DB연결
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3. Statement 객체 생성(Connection 객체로 부터)
		pstmt = conn.prepareStatement(sql);
		//4. 쿼리실행
		pstmt.setInt(1, sabun);
		pstmt.setString(2, name);
		pstmt.setInt(3, pay);
		
		//5. 쿼리 실행 결과에 대한 처리
		
		pstmt.executeUpdate();
		//3. 페이지 이동처리
		response.sendRedirect("list2.jsp");
		
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
<title>예외발생</title>
</head>
<body>
	<h1>사원 등록 실패</h1>
	<p>입력처리를 하지 못했습니다<br>
	담당자에게 연락하세요</p>
	<a href="addForm2.jsp">입력페이지로 이동</a>
	<a href="list2.jsp">전체목록 보기</a>
</body>
</html>