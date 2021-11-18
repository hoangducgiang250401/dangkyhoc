package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.HttpUtil;
import dao.DAOgetRegisted;
import model.Registed;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/scan"})
public class ScanRegister extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String calendar[] = HttpUtil.getTime().split("/");
		req.setAttribute("year", calendar[0]);
		req.setAttribute("month", calendar[1]);
		req.setAttribute("date", calendar[2]);
		List<Registed> list = DAOgetRegisted.getRegisted((String) req.getSession().getAttribute("id"));
		int sumCredis = 0;
		for(Registed r : list) {
			sumCredis += r.getCredis();
		}
		req.setAttribute("listSubjectRegisted", list);
		req.setAttribute("sumCredis", sumCredis);
		req.getRequestDispatcher("views/indangkyhoc.jsp").forward(req, resp);
	}
}
