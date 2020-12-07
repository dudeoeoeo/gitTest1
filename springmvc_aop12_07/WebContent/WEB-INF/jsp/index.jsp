<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#content {
	width : 810px;
	margin : auto;
}
#content ul li { list-style: none; float: left; background: orange;
margin-left: 3px; width: 200px; height: 50px; text-align: center;
}
</style>
</head>
<body>
	<h1>jsp 폴더 안의 index 파일</h1>
	<h2>${msg}</h2>
	
	<div id="content">
		<ul>
			${userName}
			<li><a href="login">로그인</a></li><br>
			<li> 홍 하위~ </li><br>
			<li><a href="logout">로그아웃</a></li>	<br>
		</ul>
	</div>
	
</body>
</html>