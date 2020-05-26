package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Mutter;

public class MutterDAO {

	private final String JDBC_URL = "jdbc:mysql://localhost:3306/DOCOTSUBU?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";

	public List<Mutter> findAll() {
		List<Mutter> mutterList = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "SELECT ID,NAME,TEXT FROM MUTTER ORDER BY ID DESC";

			PreparedStatement pStmt = con.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				String text = rs.getString("TEXT");

				Mutter mutter = new Mutter(id,name,text);

				mutterList.add(mutter);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mutterList;

	}

	public boolean create(Mutter mutter) {
		try(Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "INSERT INTO MUTTER(NAME,TEXT) VALUES(?,?)";

			PreparedStatement pStmt = con.prepareStatement(sql);

			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());

			int rs = pStmt.executeUpdate();

			if(rs !=1) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;

	}
}
