<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%-- ���� �ʱ�ȭ(��ȿȭ) --%>
<%
	//���� �ʱ�ȭ(��ȿȭ)
	session.invalidate();

	//���û ó��(ex01_session.jsp �������� �̵�)
	response.sendRedirect("ex01_session.jsp");
%>