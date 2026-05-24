package com.repair.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.repair.model.Booking;
import com.repair.util.DBUtil;

public class BookingDAO {

	public boolean addBooking(Booking booking) {
		boolean status = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "insert into bookings(customer_name,mobile,address,device_type,problem,booking_status,user_email) values(?,?,?,?,?,?,?)";
			System.out.println("sql query for booking:" + sql);
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, booking.getCustomerName());
			ps.setString(2, booking.getMobile());
			ps.setString(3, booking.getAddress());
			ps.setString(4, booking.getDeviceType());
			ps.setString(5, booking.getProblem());
			ps.setString(6, "pending");
			ps.setString(7, booking.getUserEmail());

			int i = ps.executeUpdate();

			if (i > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public List<Booking> getAllBookings() {

		List<Booking> list = new ArrayList<>();

		try {

			Connection con = DBUtil.getConnection();

			String sql = "SELECT * FROM bookings";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Booking booking = new Booking();

				booking.setId(rs.getInt("id"));

				booking.setCustomerName(rs.getString("customer_name"));

				booking.setMobile(rs.getString("mobile"));

				booking.setAddress(rs.getString("address"));

				booking.setDeviceType(rs.getString("device_type"));

				booking.setProblem(rs.getString("problem"));

				booking.setBookingStatus(rs.getString("booking_status"));

				list.add(booking);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}

	public boolean updateBookingStatus(int id) {

		boolean status = false;

		try {

			Connection con = DBUtil.getConnection();

			String sql = "UPDATE bookings SET booking_status=? WHERE id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, "Completed");

			ps.setInt(2, id);

			int i = ps.executeUpdate();

			if (i > 0) {

				status = true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return status;
	}

	public boolean deleteBooking(int id) {

		boolean status = false;

		try {

			Connection con = DBUtil.getConnection();

			String sql = "DELETE FROM bookings WHERE id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int i = ps.executeUpdate();

			if (i > 0) {

				status = true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return status;
	}

	public List<Booking> getBookingsByUser(String email) {

		List<Booking> list = new ArrayList<>();

		try {

			Connection con = DBUtil.getConnection();

			String sql = "SELECT * FROM bookings WHERE user_email=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Booking booking = new Booking();

				booking.setId(rs.getInt("id"));

				booking.setCustomerName(rs.getString("customer_name"));

				booking.setMobile(rs.getString("mobile"));

				booking.setAddress(rs.getString("address"));

				booking.setDeviceType(rs.getString("device_type"));

				booking.setProblem(rs.getString("problem"));

				booking.setBookingStatus(rs.getString("booking_status"));

				list.add(booking);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
}
