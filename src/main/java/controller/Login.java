package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOlogin;
import model.Accounts;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is login");
		req.getRequestDispatcher("views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("email");
		String pass = req.getParameter("password");
		System.out.println("User: " + user+"\nPassword: " + pass);
		Accounts accounts = DAOlogin.checkLogin(user, pass);
		if(accounts == null) {
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}
		else {
			String[] email = user.split("@");
			req.getSession().setAttribute("user", user);
			req.getSession().setAttribute("id", email[0]);
			req.getSession().setAttribute("name", DAOlogin.getName(email[0]));
			if(accounts.getIsadmin() == 1) {
				resp.sendRedirect("/dangkyhoc/admin");
			}else {
				resp.sendRedirect("home");
			}
		}
	}
}
