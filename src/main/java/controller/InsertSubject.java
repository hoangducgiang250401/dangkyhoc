package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOinsertSubject;
import model.Asubject;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/api-insert_subject"})
public class InsertSubject extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST: api-insert_subject");
		req.setCharacterEncoding("UTF-8");
		try {
			DAOinsertSubject.insertSubject(new Asubject(Integer.parseInt(req.getParameter("id_sj")),
					req.getParameter("subjectname"),
					Integer.parseInt(req.getParameter("credis")), 
					req.getParameter("classname"), 
					Integer.parseInt(req.getParameter("maxsd")), 
					Integer.parseInt(req.getParameter("thu")), 
					req.getParameter("period"), 
					req.getParameter("room"), 
					Integer.parseInt(req.getParameter("id_lt"))));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("admin");
		
	}

}
