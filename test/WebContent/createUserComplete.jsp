<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="3;URL='LoginAction'">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var form = document.getElementById('createUserForm');
		setTimeout(function(){form.submit()},3000);
	}
</script>
</head>
<body>
	<div>
		<h3>ユーザー登録が完了しました。</h3>
	</div>
	<s:form id="createUserForm" action="LoginAction">
	<s:hidden name="userId" value="%{#session.userIdForCreateUser}" />
	<s:hidden name="password" value="%{#session.password}" />
</s:form>

</body>
</html>