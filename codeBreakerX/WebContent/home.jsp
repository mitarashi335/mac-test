<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
<link rel="stylesheet" href="./css/home.css">
<title>スタート画面</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>
<jsp:include page="header.jsp"/>
<h3>3桁の数字を当てるゲーム</h3>
<div id="explain">プレイヤーが３桁の数字を入力(ショット)して、<br>
	数字のみを当てれば<div class="emphasis">Blow</div><br>
	数字と桁数(位置)を当てれば<div class="emphasis">Hit</div><br>
	<span class="emphasis">3Hit</span>(数字と位置を全て当てる事)で<span class="emphasis">クリア！！</span><br>
	<span class="emphasis">同じ</span>数字は入りません。<br>
	<span class="emphasis">現状５回</span>まで解答できます。
</div>
<div class="A"><h4>一投目</h4>
1桁目=5, 2桁目=2, 3桁目=4<br>
このショットで<br>
Hit:1<br>
Blow:2<br>
の場合,数字３つは合っているが、<br>
位置が合っていない(非常に惜しい)状態。
</div>
<div id="under">
<button>見本</button>


	<s:form action="StartAction">
		<s:submit value="START" />
	</s:form>
</div>
	<script src="./js/home.js"></script>
</body>
</html>