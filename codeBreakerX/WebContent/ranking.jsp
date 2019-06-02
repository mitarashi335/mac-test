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
<!-- ランキング5位まで表示したい -->

<br>
<!-- 文字エラー等を後々記載 -->
<s:if test="rankNameErrorMessageList != null && rankNameErrorMessageList.size() > 0">
<div>
	<s:iterator value="rankNameErrorMessageList" ><s:property /><br></s:iterator>
</div>
</s:if>
<s:else>
<table>
	<thead>
	<tr>
		<th>順位</th>
		<th>名前</th>
		<th>解答回数</th>
	</tr>
	</thead>
	<tbody>
	<s:iterator value="rankInfoList">
	<tr>
		<td><s:property value="ranking"/></td>
		<td><s:property value="rankName"/></td>
		<td><s:property value="answerTimes"/></td>
	</tr>
	</s:iterator>
	</tbody>
</table>
</s:else>
<!-- ランキング入力 -->
<s:form action="RankingCompleteAction">
	<table>
		<tr>
			<th scope="row">名</th>
			<td><s:textfield name="rankName" value=""/></td>
		</tr>
	</table>
	<s:submit value="登録" cssClass="btn"/>
</s:form>
</body>
</html>