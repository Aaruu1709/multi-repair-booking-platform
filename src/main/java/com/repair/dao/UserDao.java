package com.repair.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.repair.model.User;
import com.repair.util.DBUtil;

public class UserDao {

	public boolean registerUser(User user) {
		boolean status = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "insert into repairplatformsers(name,email,password,mobile,address,role)values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getMobile());
			ps.setString(5, user.getAddress());
			ps.setString(6, "USER");// here we manually assign role user
			// same we use for pending status

			int i = ps.executeUpdate();
			if (i > 0) {
				status = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public User loginUser(String email, String password) {

		User user = null;

		try {

			Connection con = DBUtil.getConnection();

			String sql = "SELECT * FROM repairplatformsers WHERE email=? AND password=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email.trim());

			ps.setString(2, password.trim());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				user = new User();

				user.setId(rs.getInt("id"));

				user.setName(rs.getString("name"));

				user.setEmail(rs.getString("email"));

				user.setPassword(rs.getString("password"));

				user.setMobile(rs.getString("mobile"));

				user.setAddress(rs.getString("address"));

				user.setRole(rs.getString("role"));

				System.out.println("LOGIN SUCCESS");
			} else {

				System.out.println("LOGIN FAILED");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return user;
	}

}
