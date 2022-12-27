package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;

@WebServlet("/MVCDeleteBoardController")
public class MVCDeleteBoardController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청처리
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("MVCDeleteBoardController.doPost.no :"+no);
		
		// 모델호출
		BoardService boardService = new BoardService();
		boardService.removeBoardList(no);
		
		response.sendRedirect(request.getContextPath()+"/MVCBoardListController");
	}
}
