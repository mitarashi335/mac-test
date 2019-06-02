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
<s:if test="LuckyShot==1">
	<h1 id="Excelent">EXCELENT!!</h1>
</s:if>
<s:elseif test="LuckyShot==2">
	<h1 id="Nice">NICE</h1>
</s:elseif>
<s:else>
	<h2 id="Good">GOOD</h2>
</s:else>

<!-- ボタンが右表示を直す -->
<div class="btnArea">
	<form action="RankingAction">
		<s:submit value="ランキング登録" cssClass="btn"/>
	</form>
	<form action="GoHomeAction">
		<s:submit value="ホームへ" cssClass="btn"/>
	</form>
</div>
</body>
</html>