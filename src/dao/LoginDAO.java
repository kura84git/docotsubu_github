package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;

public class LoginDAO {
	public boolean find(User user) {
		final String JDBC_URL = "jdbc:mysql://localhost:3306/DOCOTSUBU?characterEncoding=utf-8&serverTimezone=JST";
		final String DB_USER = "root";
		final String DB_PASS = "root";

		try (Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "SELECT NAME,PASS FROM ACCOUNT WHERE NAME=? AND PASS=?";

			PreparedStatement pStmt = con.prepareStatement(sql);

			pStmt.setString(1, user.getName());
			pStmt.setString(2, user.getPass());

			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}
