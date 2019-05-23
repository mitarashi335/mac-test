<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
<script type="text/javascript" src="./js/createUser.js">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
<div>
	<s:form>
		<h1>登録内容確認</h1>
			<tr>
				<td scope="row"><s:label value="姓"/></td>
				<td><s:property value="familyName" />
				</td>
			</tr>
			<tr>
				<td scope="row">
					<label>名</label>
				</td>
				<td><s:property value="firstName" />
				</td>
			</tr>

			<tr>
				<td scope="row">
					<label>せい</label>
				</td>
				<td><s:property value="familyNameKana" /></td>
			</tr>
			<tr>
				<td scope="row">
					<label>めい</label>
				</td>
				<td><s:property value="firstNameKana" /></td>
			</tr>

			<tr>
				<td>
					<label>性別</label>
				</td>
				<td>
					<s:if test="%{#session.sex==0}">
					    <p>男</p>
					</s:if>
					<s:else>
					    <p>女</p>
					</s:else>
				</td>
			</tr>


			<tr>
				<td scope="row">
					<s:label value="メールアドレス"/>
				</td>
				<td><s:property value="email" /></td>
			</tr>

			<tr>
				<td>
					<label>ユーザーID</label>
				</td>
				<td>
					<s:property value="userId" />
				</td>
			</tr>
			<tr>
				<td>
					<label>パスワード</label>
				</td>
				<td>
					<s:property value="password"/>
				</td>
			</tr>
			<tr>
				<td><s:submit value="戻る" class="submit_btn" onclick="goCreateUserAction()"/></td>
				<td><s:submit value="登録" class="submit_btn" onclick="goCreateUserCompleteAction()"/></td>
			</tr>
		<s:hidden id="backFlag" name="backFlag" value=""/>

		</s:form>
	</div>

</body>
</html>