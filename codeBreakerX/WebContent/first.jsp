<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/common.css">
<title>初回解答画面</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<s:if test="sameNumberErrorMessage != null && !sameNumberErrorMessage.isEmpty()">
<div>
	<s:iterator value="sameNumberErrorMessage" ><s:property /><br></s:iterator>
</div>
</s:if>

<s:form action="FirstShotAction" theme="simple">
	<table>
		<tr>
			<th scope="col" class="shot">一桁目</th>
			<th scope="col" class="shot">二桁目</th>
			<th scope="col" class="shot">三桁目</th>
		</tr>
		<tr>
			<td class="shot"><select name="tryOnea" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td class="shot"><select name="tryOneb" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td class="shot"><select name="tryOnec" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
		</tr>
		<tr>
			<td><s:submit value="ショット" cssClass="btn"/></td>
		</tr>
	</table>
</s:form>
</body>
</html>