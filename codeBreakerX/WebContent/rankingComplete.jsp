<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/common.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>登録完了しました。</h1>
<form action="GoHomeAction">
	<s:submit value="ホームへ戻る" cssClass="btn"/>
</form>
<form action="FinRankingAction">
	<s:submit value="ランキングへ" cssClass="btn"/>
</form>
</body>
</html>