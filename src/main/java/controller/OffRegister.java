package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/OffRegister"})
public class OffRegister extends HttpServlet {
	@Override
	public void init() throws ServletException {
		
		super.init();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is off register");
		ServletContext dangKyHoc = getServletConfig().getServletContext();
		String on = (String) dangKyHoc.getAttribute("on");
		if(on == "OFF") {
			dangKyHoc.setAttribute("on", "ON");
		}
		else if(on == null) {
			dangKyHoc.setAttribute("on", "OFF");
		}
		else {
			dangKyHoc.setAttribute("on", "OFF");
		}

		resp.sendRedirect("admin");
	}

}
