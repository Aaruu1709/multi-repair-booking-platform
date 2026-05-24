package com.repair.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repair.dao.BookingDAO;
import com.repair.dao.UserDao;
import com.repair.model.Booking;
import com.repair.model.User;

@Controller
public class AdminController {

	@RequestMapping("/adminDashboard")

	public String adminDashboard(Model model) {

		BookingDAO dao = new BookingDAO();

		List<Booking> bookingList = dao.getAllBookings();

		model.addAttribute("bookings", bookingList);

		return "adminDashboard";
	}

	@RequestMapping("/updateStatus")

	public String updateStatus(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));

		BookingDAO dao = new BookingDAO();

		dao.updateBookingStatus(id);

		return "redirect:/adminDashboard";
	}

	@RequestMapping("/deleteBooking")

	public String deleteBooking(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));

		BookingDAO dao = new BookingDAO();

		dao.deleteBooking(id);

		return "redirect:/adminDashboard";
	}

	@RequestMapping("/adminLogin")

	public String adminLogin(HttpServletRequest request, HttpSession session) {

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		UserDao dao = new UserDao();

		User user = dao.loginUser(username, password);

		if (user != null && user.getRole().equals("ADMIN")) {

			session.setAttribute("admin", user);

			return "redirect:/adminDashboard";
		} else {

			return "adminLogin";
		}
	}
}