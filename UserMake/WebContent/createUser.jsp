<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
String userName = (String)session.getAttribute("name");
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>つくりまひょ</title>
</head>
<body>
	<s:form action="createUserConfirmAction">
		<tr>
			<td>
				<label>姓</label>　:　<label>名</label>
			</td>
			<td>
				<input type="text" name="family_name" value="" />:<input type="text" name="first_name" value="" />
			</td>

		</tr>
		<tr>
			<td>
				<label>ふりがな(姓)</label> : <label>ふりがな(名)</label>
			</td>
			<td>
				<input type="text" name="family_name_kana" value="" />:<input type="text" name="first_name_kana" value="" />
			</td>
		</tr>
		<tr>
			<td>
				<label>ユーザーID</label>
			</td>
			<td>
				<input type="text" name="user_id" value="" />
			</td>
		</tr>
		<tr>
			<td>
				<label>パスワード</label>
			</td>
			<td>
				<input type="text" name="password" value="" />
			</td>
		</tr>
		<tr>
			<td>
				<label>メールアドレス</label>
			</td>
			<td>
				<input type="text" name="mail" size="32" value="" />
			</td>
		</tr>
		<tr>
			<td>
				<label>性別</label>
			</td>
			<td>
				<input type="radio" name="man" size="32" value="" checked/>男
				<input type="radio" name="woman" size="32" value="" />女
			</td>
		</tr>
		<s:submit value="送信"/>
	</s:form>
</body>
</html>