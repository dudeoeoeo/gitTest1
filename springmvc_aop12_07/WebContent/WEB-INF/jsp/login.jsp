<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="content">

<fieldset style="width: 300px; margin: auto">

<legend>로그인 폼</legend>

<form method="post" action="loginProcess" 

autocomplete="off">

<p>

<label>아이디</label>

<input type="text" name="id" id="id">

</p>

<p>

<label>비밀번호</label>

<input type="password" name="pwd" id="pwd">

</p>

<p style="text-align: right;">

​

<input type="submit" value="로그인 ">

</p>

</form>

​

</fieldset>

</div>
</body>
</html>