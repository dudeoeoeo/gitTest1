<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<c:choose>
			<c:when test="${sessionScope.userName == null}">
			<li><a href="login">로그인</a></li><br>
			</c:when>
			<c:otherwise>
			<li> ${ sessionScope.userName } 하위~ </li><br>
			<li><a href="logout">로그아웃</a></li>	<br>
			</c:otherwise>
		</c:choose>
		<li><a href="mytoday1">Today테스트</a></li>
		</ul>
	</div>
	
</body>
</html>