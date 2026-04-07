package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calc;

@WebServlet("/ServletSample")
public class ServletSample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("GET通信です。");
		perform(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("POST通信です。");
	}
	
	public void perform(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("ブラウザからのリクエストを受け取りました。");
		
		// 転送された、ブラウザからの入力値を受け取る
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		// モデルに渡して計算
		Calc calc = new Calc(a,b);
		
		// モデルで計算した結果をRequestに格納
		req.setAttribute("calc", calc.resultList);
		
		// 遷移先を指定
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/result.jsp");
		
		// 実際に遷移
		rd.forward(req, resp);
		
	}
	
}