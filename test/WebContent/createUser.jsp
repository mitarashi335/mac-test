<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ユーザ情報入力</title>
<link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>
<body>
	<s:if test="userIdErrorMessageList != null && userIdErrorMessageList.size() > 0">
		<s:iterator value="userIdErrorMessageList"><s:property /><br>
		</s:iterator>
	</s:if>
	<s:if test="firstNameErrorMessageList != null && firstNameErrorMessageList.size() > 0"  >
				<s:iterator value="firstNameErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="familyNameErrorMessageList != null && familyNameErrorMessageList.size() > 0">
				<s:iterator value="familyNameErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="firstNameKanaErrorMessageList != null && firstNameKanaErrorMessageList.size() > 0">
				<s:iterator value="firstNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="firstNameKanaErrorMessageList != null && firstNameKanaErrorMessageList.size() > 0">
				<s:iterator value="firstNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="familyNameKanaErrorMessageList != null && familyNameKanaErrorMessageList.size() > 0">
				<s:iterator value="familyNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="passwordErrorMessageList != null && passwordErrorMessageList.size() > 0">
				<s:iterator value="passwordErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="emailErrorMessageList != null && emailErrorMessageList.size() > 0">
				<s:iterator value="emailErrorMessageList"><s:property /><br></s:iterator>
	</s:if>
	<s:if test="checkUserIdInfoMessage != null && checkUserIdInfoMessage.isEmpty()">
				<s:iterator value="checkUserIdInfoMessage"><s:property /><br></s:iterator>
	</s:if>
<div>
	<s:form action="UserCreateConfirmAction">
	<table>
		<tr>
			<th scope="row">姓</th>
			<td><s:textfield name="familyName" placeholder="姓" value="%{#session.familyName}"/></td>
		</tr>
		<tr>
			<th scope="row">名</th>
			<td><s:textfield name="firstName" placeholder="名" value="%{#session.firstName}"/></td>
		</tr>
		<tr>
			<th scope="row">せい</th>
			<td><s:textfield name="familyNameKana" placeholder="せい" value="%{#session.familyNameKana}"/></td>
		</tr>
		<tr>
			<th scope="row">めい</th>
			<td><s:textfield name="firstNameKana" placeholder="めい" value="%{#session.firstNameKana}"/></td>
		</tr>
		<tr>
			<th><label>性別</label></th>
			<td>
				<label><input type="radio" name="sex" value="0" checked>男</label>
				<label><input type="radio" name="sex" value="1">女</label>
			</td>
		</tr>
		<tr>
			<th scope="row">メールアドレス</th>
			<td><s:textfield name="email" placeholder="アドレス" value="%{#session.email}"/></td>
		</tr>
		<tr>
			<th scope="row">ユーザーID</th>
			<td><s:textfield name="userId" placeholder="ユーザーID" value="%{#session.userId}" /></td>
		</tr>
		<tr>
			<th scope="row">パスワード</th>
			<td>
				<s:password name="password" value=""/>
			</td>
		</tr>
		<s:submit value="確認"/>
		</table>
	</s:form>
</div>
</body>
</html>