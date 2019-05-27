<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>登録完了しました。</h1>
<form action="GoHomeAction">
	<s:submit value="ホームへ戻る"/>
</form>
<form action="FinRankingAction">
	<s:submit value="ランキングへ"/>
</form>
</body>
</html>