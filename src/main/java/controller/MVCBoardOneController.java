package controller;

import java.util.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;
import model.vo.*;

@WebServlet("/MVCBoardOneController")
public class MVCBoardOneController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 불러올 글 번호 
		int no = Integer.parseInt(request.getParameter("no"));
		
		// 모델호출
		BoardService boardService = new BoardService();
		Board board = boardService.getBoardOne(no);
		request.setAttribute("board", board);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/mvcBoardOne.jsp");
	    rd.forward(request, response);
	}
}
