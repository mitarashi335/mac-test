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
<h1>NICE!!</h1>
<s:form action="RankingAction">
	<s:submit value="ランキング登録"/>
</s:form>

<s:form action="GoHomeAction">
	<s:submit value="ホームへ"/>
</s:form>
</body>
</html>