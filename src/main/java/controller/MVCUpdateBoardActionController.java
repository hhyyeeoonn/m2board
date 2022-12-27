package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;
import model.vo.Board;

@WebServlet("/MVCUpdateBoardActionController")
public class MVCUpdateBoardActionController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정할 글 정보들
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("MVCUpdateBoardActionController.doPost.title :"+title);
		
		Board board = new Board();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		// 모델호출
		BoardService boardService = new BoardService();
		boardService.modifyBoardList(board);
		
		response.sendRedirect(request.getContextPath()+"/MVCBoardOneController?no="+no);
	}

}
