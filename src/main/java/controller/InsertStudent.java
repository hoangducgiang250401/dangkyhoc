package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOinsertAccount;
import dao.DAOinsertstudent;
import model.Accounts;
import model.Student;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/api-insert_student"})
public class InsertStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST: api-insert_student");
		req.setCharacterEncoding("UTF-8");
		int id_sd = Integer.parseInt(req.getParameter("id_sd"));
		String fullname = req.getParameter("fullname");
		String course = req.getParameter("course");
		String dateofbirth = req.getParameter("dateofbirth");
		int disadvantaged = Integer.parseInt(req.getParameter("disadvantaged"));
		String birthplace = req.getParameter("birthplace");
		int isamin = Integer.parseInt(req.getParameter("isadmin"));
		String username = (id_sd + "@vnu.edu.vn");
		String pass = "123";
		
		Student student = new Student(id_sd, fullname, course, dateofbirth, disadvantaged, birthplace);
		Accounts accounts = new Accounts(username, pass, id_sd, isamin);
		System.out.println(student.toString());
		System.out.println(accounts.toString());
		try {
			DAOinsertstudent.insertStudent(student);
			DAOinsertAccount.insertAccount(accounts);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("admin");
	}
}
