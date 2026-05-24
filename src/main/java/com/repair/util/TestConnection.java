package com.repair.util;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {

		Connection con = DBUtil.getConnection();

		if (con != null) {

			System.out.println("Connection Success");
		} else {

			System.out.println("Connection Failed");
		}
	}
}