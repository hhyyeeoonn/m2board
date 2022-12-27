package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;
import model.vo.*;

// C -> M 클라이언트가 다른 컨트롤러를 요청하도록 리다이렉트
@WebServlet("/MVCAddBoardActionController")
public class MVCAddBoardActionController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("MVCAddBoardActionController.doPost.title :"+title);

		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
		
		// 모델호출
		BoardService boardService = new BoardService();
		boardService.insertBoardList(board); // 서버스는 dao호출 dao.insertBoard(conn, board)
				
		// 뷰가 없다
		response.sendRedirect(request.getContextPath()+"/MVCBoardListController");
	}
}
