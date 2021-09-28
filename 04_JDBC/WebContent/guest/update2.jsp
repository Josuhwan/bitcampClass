<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달받은 데이터(파라미터값) 사용해서 DB데이터 수정 처리
	 수정할 데이터 : 성명, 금액, 날짜(SYSDATE)
	 정상처리후 : list.jsp 이동 또는 detail.jsp 페이지 이동 처리
	 예외발생시 : 현재페이지 보여주기
--%>
<%
	//1. 전달받은 파라미터 값 확인(추출)
	
	//2. DB수정 작업
	
	//3. 페이지 이동처리
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외발생</title>
</head>
<body>
	<h1>사원정보 수정 실패</h1>
	<p>수정처리를 하지 못했습니다<br>
	담당자에게 연락하세요</p>
	<a href="detail.jsp?sabun=6666">상세페이지로 이동</a>
	<a href="list.jsp">전체목록 보기</a>

</body>
</html>