package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOda_hoc;
import dao.DAOgetRegisted;
import dao.DAOgetsubject;
import model.Da_hoc;
import model.Registed;
import model.Subject;

@WebServlet(urlPatterns = { "/home" })
public class Trangchu extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext dangKyHoc = getServletConfig().getServletContext();
		String on = (String) dangKyHoc.getAttribute("on");
		if (on == "OFF") {
			resp.sendRedirect("view/offregister.jsp");
		}
		else {
			System.out.println("This is home page");
			String id = (String) req.getSession().getAttribute("user");
			List<Subject> list_subject = DAOgetsubject.get_listSJ();
			List<Registed> list_registed = DAOgetRegisted.getRegisted(id);
			List<Da_hoc> list_experience = DAOda_hoc.getdahoc(id);
			for (Subject mon : list_subject) {
				for (Registed dk : list_registed) {
					if (mon.getId_sj() == dk.getId_sj()) {
						mon.setTrang_thai("đã đk");
					}
				}
				for (Da_hoc dh : list_experience) {
					if (mon.getId_sj() == dh.getId_sj()) {
						mon.setTrang_thai(dh.getStt());
					}
				}
			}
			for (Registed registed : list_registed) {
				if (registed.getStatus() == null || registed.getStatus().equals("") || registed.getStatus().isEmpty()) {
					registed.setStatus("đăng ký lần đầu");
				}
			}
			req.setAttribute("list_sj", list_subject);
			req.setAttribute("registed", list_registed);
			req.getRequestDispatcher("views/trangchu.jsp").forward(req, resp);
		}
	}
}
