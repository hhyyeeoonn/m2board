<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!-- //컨트롤러에서 공유한 모델데이터를 셋팅Board board = (Board)(request.getAttribute("board")); -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m1ModifyBoardForm.jsp</title>
</head>
<body>
	
	<h1>MVC 게시글 수정</h1>
	<form action = "${pageContext.request.contextPath}/MVCUpdateBoardActionController?no=${board.no}" method = "post">
		<input type = "hidden" name = "no" value = "${board.no}">
		<table>
			<tr>
				<th>title</th>
				<td>
					<input type = "text" name = "title" value = "${board.title}">
				</td>
			</tr>
			<tr>
				<th>content</th>
				<td>
					<textarea rows = "5" cols = "50"  name = "content">${board.content}</textarea>
				</td>
			</tr>
		</table>
		<button type = "submit">수정하기</button>
	</form>
</body>
</html>