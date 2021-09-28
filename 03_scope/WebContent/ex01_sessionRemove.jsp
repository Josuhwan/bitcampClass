<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- 세션에 설정된 속성 삭제 --%>
<%
	//속상 자체를 삭제(attr_age)
	//session.removeAttribute("attr_age"); //속성삭제 - 속성이 없어짐
	session.setAttribute("attr_age","");
	
	// 재요청 처리(ex01_session.jsp 페이지로 이동)
	response.sendRedirect("ex01_session.jsp");
%>
