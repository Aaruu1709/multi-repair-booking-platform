package com.repair.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repair.dao.BookingDAO;
import com.repair.model.Booking;
import com.repair.model.User;

@Controller
public class BookingController {

	@RequestMapping("/booking")

	public String addBooking(HttpServletRequest request, HttpSession session) {

		String customerName = request.getParameter("customerName");

		String mobile = request.getParameter("mobile");

		String address = request.getParameter("address");

		String deviceType = request.getParameter("deviceType");

		String problem = request.getParameter("problem");

		Booking booking = new Booking();

		booking.setCustomerName(customerName);

		booking.setMobile(mobile);

		booking.setAddress(address);

		booking.setDeviceType(deviceType);

		booking.setProblem(problem);

		BookingDAO dao = new BookingDAO();
		User user = (User) session.getAttribute("user");

		booking.setUserEmail(user.getEmail());

		boolean status = dao.addBooking(booking);

		System.out.println("Testing booking insert...");

		if (status) {

			System.out.println("Booking Success");

			return "redirect:/bookingSuccessPage";
		} else {

			System.out.println("Booking Failed");

			return "dashboard";
		}
	}
}