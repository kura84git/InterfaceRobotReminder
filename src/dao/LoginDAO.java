package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class LoginDAO {
	public boolean find(User user) { //IDとパスワードの照合

		final String JDBC_URL = "jdbc:mysql://localhost:3306/interfacerobot?characterEncoding=utf-8&serverTimezone=JST";
		final String DB_USER = "root";
		final String DB_PASS = "root";

		try(Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){

			//SQL文
			String sql = "SELECT ID,PASS FROM ACCOUNT WHERE ID=? AND PASS=?";

			//SQL文送信
			PreparedStatement pStmt = con.prepareStatement(sql);

			//SQL文に情報を渡す
			pStmt.setString(1, user.getId());
			pStmt.setString(2, user.getPass());

			//SQL文を実行し結果を取得
			ResultSet rs = pStmt.executeQuery();

			//情報を取り出せた場合
			if(rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		//情報を取り出せなかった場合
		return false;
	}
}
