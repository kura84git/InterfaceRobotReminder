package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginBO;
import model.User;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータ取得
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		//Userインスタンスの生成
		User user = new User(id,pass);

		//ログイン処理(LoginLogicインスタンスの生成)
		LoginBO bo = new LoginBO();
		//ログイン処理メソッド
		boolean isLogin = bo.excute(user);

		//ログインに成功した場合の処理
		if(isLogin) {
			//ユーザー情報をセッションスコープに保存
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

		}

		//loginResult.jspへフォワード
		String path = "/WEB-INF/jsp/loginResult.jsp";
		RequestDispatcher dis = request.getRequestDispatcher(path);
		dis.forward(request, response);


	}

}
