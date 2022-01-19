<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="500px">
		<tr>
			<th>회원번호</th>
			<th>회원이름</th>
			<th>전화번호</th>
			<th>회원주소</th>
			<th>가입일</th>
			<th>삭제</th>
			<th>수정</th>
		</tr>
		<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.name }</td>
			<td>${vo.phone }</td>
			<td>${vo.addr }</td>
			<td>${vo.regdate }</td>
			<td><a href="${pageContext.request.contextPath }/delete?num=${vo.num }">삭제</a></td>
			<td><a href="${pageContext.request.contextPath }/update?num=${vo.num }">수정</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>