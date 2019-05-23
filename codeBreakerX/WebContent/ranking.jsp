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
<!-- ランキング5位まで表示 -->
<!-- ランキングテーブルはname,解答回数, -->
<!-- 文字エラー等を後々記載 -->
<!-- ランキング入力 -->
<s:form action="RankingCompleteAction">
	<table>
		<tr>
			<th scope="row">名</th>
			<td><s:textfield name="rankName" value=""/></td>
		</tr>
	</table>
	<s:submit value="登録" />
</s:form>
</body>
</html>