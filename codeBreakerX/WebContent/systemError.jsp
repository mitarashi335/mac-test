<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<h1>長考によるタイムアウトが発生しました。</h1>
<h3>ブドウ糖を摂取して頭をリフレッシュしましょう。</h3>
<br>
<h1>もしくはエラーが発生しました。</h1>
<h3>管理者に連絡して下さい。</h3>

<s:form action="GoHomeAction">
	<s:submit value="ホームへ"/>
</s:form>
</body>
</html>