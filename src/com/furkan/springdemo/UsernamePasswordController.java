package com.furkan.springdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsernamePasswordController {

	String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

	@RequestMapping("/loginForm")
	public String loginFormScreen() {

		return "loginform";
	}
	
	@RequestMapping("/") // root page
	public String mainMenuScreen() {

		return "root-page";
	}

	@RequestMapping("/menuFail")
	public String failScreen() {

		return "failmenu";
	}

	@RequestMapping("/controlMenu")
	public String mainMenuScreen(HttpServletRequest request, Model model) throws SQLException {

		String name = request.getParameter("userName");
		String password = request.getParameter("password");

		Connection myConn = DriverManager.getConnection(dbUrl, "iskur", "system"); // myDatabase name iskur and password system.

		PreparedStatement stmt = myConn
				.prepareStatement("Select first_name,last_name from users where user_name=? and password=? "); // ? wants parameter to be passed 

		stmt.setString(1, name);
		stmt.setString(2, password);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {

			model.addAttribute("name", rs.getString(1));
			model.addAttribute("password", rs.getString(2));
			return "successfullPage";

		}

		return "failmenu";

	}

}
