package com.repair.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repair.dao.BookingDAO;
import com.repair.model.Booking;
import com.repair.model.User;

@Controller
public class MyBookingController {

	@RequestMapping("/myBookings")

	public String myBookings(Model model, HttpSession session) {

		User user = (User) session.getAttribute("user");

		BookingDAO dao = new BookingDAO();

		List<Booking> list = dao.getBookingsByUser(user.getEmail());

		model.addAttribute("bookings", list);

		return "myBookings";
	}
}