package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.RegisterUser;

public class AccountDAO {
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/DOCOTSUBU?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";

	public boolean insert(RegisterUser registerUser) {
		try (Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "INSERT INTO ACCOUNT (USERID,NAME,PASS,MAIL,AGE) VALUES(?,?,?,?,?)";
			PreparedStatement pStmt = con.prepareStatement(sql);

			pStmt.setString(1, registerUser.getUserId());
			pStmt.setString(2, registerUser.getName());
			pStmt.setString(3, registerUser.getPass());
			pStmt.setString(4, registerUser.getMail());
			pStmt.setInt(5, registerUser.getAge());

			int rs = pStmt.executeUpdate();

			if(rs != 1) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}
}
