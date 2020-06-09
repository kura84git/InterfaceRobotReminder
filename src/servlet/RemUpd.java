package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RemSelcBO;
import model.RemUpdBO;
import model.Remind;


@WebServlet("/RemUpd")
public class RemUpd extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータの取得
		String action = request.getParameter("action");

		//確認画面で「戻る」を選択された場合
		if(action == null) {
			HttpSession session = request.getSession();
			Remind remUpd = (Remind)session.getAttribute("remUpd");

			int remindId = remUpd.getRemindId();
			String userId = remUpd.getUserId();

			Remind id = new Remind(remindId, userId);

			RemSelcBO bo = new RemSelcBO();
			remUpd = bo.execute(id);

			//セッションスコープに現在のリマインド情報を格納
			session.setAttribute("remUpd", remUpd);

			//remUpd.jspへフォワード
			String path = "/WEB-INF/jsp/remUpd.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);
		}

		//確認画面で「実行」が押された場合
		else {
			HttpSession session = request.getSession();

			//セッションスコープから更新リマインド情報を取得
			Remind remUpd = (Remind) session.getAttribute("remUpd");

			//リマインド書き換え処理
			RemUpdBO bo = new RemUpdBO();
			boolean remRes = bo.execute(remUpd);

			//リクエストスコープに実行結果格納
			request.setAttribute("remRes", remRes);

			//remUpdRes.jspへフォワード
			String path = "/WEB-INF/jsp/remUpdRes.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);
		}

	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		String action = request.getParameter("action");

		//リクエストパラメータがnullの場合
		if(action == null) {
			//リクエストパラメータの取得
			int remindId = Integer.parseInt(request.getParameter("remindId"));
			String userId = request.getParameter("userId");

			Remind id = new Remind(remindId, userId);

			RemSelcBO bo = new RemSelcBO();
			Remind remUpd = bo.execute(id);

			HttpSession session = request.getSession();

			//セッションスコープに現在のリマインド情報を格納
			session.setAttribute("remUpd", remUpd);

			//remUpd.jspへフォワード
			String path = "/WEB-INF/jsp/remUpd.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);
		}

		//リクエストパラメータがdoneの場合(確認画面で承認された場合)
		else if(action.equals("done")) {

			request.setCharacterEncoding("UTF-8");
			//リクエストパラメータの取得
			String specifiedRemind = request.getParameter("specifiedRemind");
			String specifiedCategory = request.getParameter("specifiedCategory");

			HttpSession session = request.getSession();
			Remind remUpd = (Remind)session.getAttribute("remUpd");

			remUpd = new Remind(remUpd.getRemindId(), remUpd.getUserId(), specifiedRemind, specifiedCategory);

			//セッションスコープにリマインドの書き換え情報を格納
			session.setAttribute("remUpd", remUpd);

			//remUpdConfirm.jspへフォワード
			String path = "/WEB-INF/jsp/remUpdConfirm.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);

		}

	}

}
