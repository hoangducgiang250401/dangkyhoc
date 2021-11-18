package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.type.TypeReference;

import Util.HttpUtil;
import dao.DAOdeleteRegisted;
import dao.DAOinsertRegister;
import model.Registed;

@WebServlet(urlPatterns = {"/api-register"})
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Post-api-register");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		String id = (String) req.getSession().getAttribute("id");
		
		List<Registed> list = HttpUtil.of(req.getReader()).toModel(new TypeReference<List<Registed>>(){});
		
		try {
			DAOdeleteRegisted.deleteRegisted(id);
			DAOinsertRegister.insertRegister(id, list);
		} catch (SQLException e) {
			System.out.println("Error : in 'api-register'");
		}
		
		System.out.println(list);
		
//		req.getRequestDispatcher("views/trangchu.jsp").forward(req, resp);
		
	}
	
//	@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			// TODO Auto-generated method stub
//			
//			System.out.println("get : register");
//			req.getRequestDispatcher("views/trangchu.jsp").forward(req, resp);
//			super.doGet(req, resp);
//		}
}
