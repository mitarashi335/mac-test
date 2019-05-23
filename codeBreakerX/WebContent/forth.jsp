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
<s:if test="sameNumberErrorMessage != null && !sameNumberErrorMessage.isEmpty()">
<div>
	<s:iterator value="sameNumberErrorMessage" ><s:property /><br></s:iterator>
</div>
</s:if>
	<table>
	<tr>
		<th scope="col">一投目</th>
	</tr>
	<tr>
		<th scope="col">1桁目</th>
		<th scope="col">2桁目</th>
		<th scope="col">3桁目</th>
		<th scope="col">HIT</th>
		<th scope="col">BLOW</th>
	</tr>
	<tr>
		<td><s:property value="%{#session.tryOnea}" /></td>
		<td><s:property value="%{#session.tryOneb}" /></td>
		<td><s:property value="%{#session.tryOnec}" /></td>
		<td><s:property value="%{#session.hitCount0}" /></td>
		<td><s:property value="%{#session.blowCount0}" /></td>
	</tr>
	<tr></tr>
	<tr>
		<th scope="col">二投目</th>
	</tr>
	<tr>
		<th scope="col">1桁目</th>
		<th scope="col">2桁目</th>
		<th scope="col">3桁目</th>
		<th scope="col">HIT</th>
		<th scope="col">BLOW</th>
	</tr>
	<tr>
		<td><s:property value="%{#session.tryTwoa}" /></td>
		<td><s:property value="%{#session.tryTwob}" /></td>
		<td><s:property value="%{#session.tryTwoc}" /></td>
		<td><s:property value="%{#session.hitCount1}" /></td>
		<td><s:property value="%{#session.blowCount1}" /></td>

	</tr>
	<tr></tr>
	<tr>
		<th scope="col">三投目</th>
	</tr>
	<tr>
		<th scope="col">1桁目</th>
		<th scope="col">2桁目</th>
		<th scope="col">3桁目</th>
		<th scope="col">HIT</th>
		<th scope="col">BLOW</th>
	</tr>
	<tr>
		<td><s:property value="%{#session.tryThreea}" /></td>
		<td><s:property value="%{#session.tryThreeb}" /></td>
		<td><s:property value="%{#session.tryThreec}" /></td>
		<td><s:property value="%{#session.hitCount2}" /></td>
		<td><s:property value="%{#session.blowCount2}" /></td>

	</tr>
	</table>


<s:form action="ForthShotAction">
	<table>
		<tr>
			<th scope="col">一桁目</th>
			<th scope="col">二桁目</th>
			<th scope="col">三桁目</th>
		</tr>
		<tr>
			<td><select name="tryFoura" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td><select name="tryFourb" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
			<td><select name="tryFourc" >
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select></td>
		</tr>
		<s:submit value="ショット"/>
	</table>
</s:form>

</body>
</html>