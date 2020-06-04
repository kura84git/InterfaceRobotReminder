package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class AccountDAO {
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/interfacerobot?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";


	public boolean insert(User registerUser) { //アカウント登録

		try(Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){

			//SQL文
			String sql = "INSERT INTO ACCOUNT (ID,NAME,PASS,MAIL,BOTNAME) VALUES(?,?,?,?,?)";

			//SQL文送信
			PreparedStatement pStmt = con.prepareStatement(sql);

			//SQL文に情報を渡す
			pStmt.setString(1, registerUser.getId());
			pStmt.setString(2, registerUser.getName());
			pStmt.setString(3, registerUser.getPass());
			pStmt.setString(4, registerUser.getMail());
			pStmt.setString(5, registerUser.getBotName());

			//SQL文を実行して結果を取得
			int rs = pStmt.executeUpdate();

			//実行できない場合
			if(rs !=1) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		//実行できた場合
		return true;

	}//insert()
}
