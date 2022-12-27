<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!-- View역할만 -->
	<!-- // 컨트롤러에서 공유한 모델데이터를 셋팅 -->
	<!-- ArrayList<Board> list = (ArrayList<Board>)(request.getAttribute("list")); -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspBoardList.jsp</title>
</head>
<body>
	<h1>MVC BOARD LIST</h1>

	<div>
		<a href = "${pageContext.request.contextPath}/MVCAddBoardFormController">글 입력</a>
	</div>
	<table border = "1">
		<thead>
			<tr>
				<th>no.</th>
				<th>title</th>
			</tr>
		</thead>
		<tbody>
			<!-- for(Board b : list) { // ResultSet타입은 내부적 이터레이터 패턴이 적용된 API를 가지고 있다 -->
			<c:forEach var = "b" items = "${list}">
				<tr>
					<td>
						${b.no}
					</td>
					<td>
						<a href = "${pageContext.request.contextPath}/MVCBoardOneController?no=${b.no}">
							${b.title}	
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>