package com.repair.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repair.dao.UserDao;
import com.repair.model.User;

@Controller
public class UserController {

	@RequestMapping("/register")
	public String registerUser(HttpServletRequest request) {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile(mobile);
		user.setAddress(address);

		UserDao dao = new UserDao();
		boolean status = dao.registerUser(user);
		if (status) {
			return "login";

		} else {
			return "register";
		}

	}

	@RequestMapping("/login")

	public String loginUser(HttpServletRequest request, HttpSession session) {

		String email = request.getParameter("email");

		String password = request.getParameter("password");

		UserDao dao = new UserDao();

		User user = dao.loginUser(email, password);
		System.out.println("eamil:" + email + "password:" + password);

		System.out.println("testing......");
		if (user != null) {

			session.setAttribute("user", user);

			return "dashboard";
		} else {
			return "login";
		}
	}

	@RequestMapping("/logout")

	public String logout(HttpSession session) {

		session.invalidate();

		return "login";
	}
}
