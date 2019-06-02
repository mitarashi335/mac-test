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
<s:if test="sameNumberErrorMessage != null && !sameNumberErrorMessage.isEmpty()">
<div>
	<s:iterator value="sameNumberErrorMessage" ><s:property /><br></s:iterator>
</div>
</s:if>
	<table>
	<tr>
		<th scope="col" >一投目</th>
	</tr>
	<tr>
		<th scope="col" class="shot">1桁目</th>
		<th scope="col" class="shot">2桁目</th>
		<th scope="col" class="shot">3桁目</th>
		<th scope="col" class="shot">HIT</th>
		<th scope="col" class="shot">BLOW</th>
	</tr>
	<tr>
		<td class="shot"><s:property value="%{#session.tryOnea}" /></td>
		<td class="shot"><s:property value="%{#session.tryOneb}" /></td>
		<td class="shot"><s:property value="%{#session.tryOnec}" /></td>
		<td class="shot"><s:property value="%{#session.hitCount0}" /></td>
		<td class="shot"><s:property value="%{#session.blowCount0}" /></td>
	</tr>
	</table>


<s:form action="SecondShotAction">
	<table>
		<tr>
			<th scope="col" class="shot">一桁目</th>
			<th scope="col" class="shot">二桁目</th>
			<th scope="col"class="shot">三桁目</th>
		</tr>
		<tr>
			<td class="shot"><select name="tryTwoa" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td class="shot"><select name="tryTwob" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td class="shot"><select name="tryTwoc" >
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