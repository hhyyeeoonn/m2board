<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

	<!-- // 컨트롤러에서 공유한 모델데이터를 셋팅 -->
	<!-- Board board = (Board)(request.getAttribute("board")); -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m1BoardOne.jsp</title>
</head>
<body>
	<h1>MVC BOARD CONTENT</h1>
	<table border = "1">
		<tr>
			<th>title</th>
			<td>
				${board.title}			
			</td>
		</tr>
		<tr>
			<th>content</th>
			<td>
				${board.content}
			</td>
		</tr>
	</table>
	<div>
		<a href = "${pageContext.request.contextPath}/MVCUpdateBoardFormController?no=${board.no}">
			<button type = "button">수정하기</button>
		</a>
	
		<a href = "${pageContext.request.contextPath}/MVCDeleteBoardController?no=${board.no}">
			<button type = "button">삭제하기</button>
		</a>

		<a href = "${pageContext.request.contextPath}/MVCBoardListController">
			<button type = "button">글목록으로</button>
		</a>
	</div>
</body>
</html>