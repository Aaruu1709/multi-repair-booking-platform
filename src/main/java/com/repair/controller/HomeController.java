package com.repair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")

	public String homePage() {

		return "home";
	}

	@RequestMapping("/registerPage")

	public String registerPage() {

		return "register";
	}

	@RequestMapping("/loginPage")

	public String loginPage() {

		return "login";
	}

	@RequestMapping("/bookingSuccessPage")

	public String bookingSuccessPage() {

		return "bookingSuccess";
	}

	@RequestMapping("/adminLoginPage")
	public String adminLoginPage() {
		return "adminLogin";
	}

	@RequestMapping("/dashboard")

	public String dashboardPage() {

		return "dashboard";
	}
}