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
<table>
	<thead>
	<tr>
		<th>順位</th>
		<th>名前</th>
		<th>解答回数</th>
	</tr>
	</thead>
	<tbody>
	<s:iterator value="finRankInfoList">
	<tr>
		<td><s:property value="ranking"/></td>
		<td><s:property value="rankName"/></td>
		<td><s:property value="answerTimes"/></td>
	</tr>
	</s:iterator>
	</tbody>
</table><br>
<p>この順位は解答回数で同列だった場合、解答できた速さで登録されます。</p>
<s:form action="GoHomeAction">
	<s:submit value="ホームへ" cssClass="btn"/>
</s:form>
</body>
</html>