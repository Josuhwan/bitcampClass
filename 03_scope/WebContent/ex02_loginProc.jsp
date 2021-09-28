<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%
	//1. 파라미터 값 추출(확인)
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	
	//2. 아이디, 암호 확인해서 로그인 처리여부 판단
	// DB 연결 안했으니 id:hong, pwd:1234 이면 성공, 나머지 실패
	boolean loginSuccess = false;
	if ("hong".equals(id) && "1234".equals(pwd)) {
		loginSuccess = true;
	}
	
	//3. 로그인 성공/실패에 따른 처리 및 페이지 이동
	
	if (loginSuccess) {
		session.setAttribute("login_chk", "ok");
		session.setAttribute("id", id);
	} else {
		session.setAttribute("login_chk", "fall");
	}
	System.out.println("> login_chk: " + session.getAttribute("login_chk"));
	
	//4. 페이지 전환
	response.sendRedirect("ex02_login.jsp");
%>
