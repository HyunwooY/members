<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		if(${result=='success'}){
			alert("회원가입이 정상적으로 되었습니다!");
		}else if(${result=='fail'}){
			alert("회원가입이 실패하였습니다.");
		}
	});
	
</script>
</head>
<body>
<h1>home</h1>

<ul>
	<li><a href="${cp }/members/insert">회원가입</a></li>
	<li><a href="">회원목록</a></li>
</ul>
</body>
</html>