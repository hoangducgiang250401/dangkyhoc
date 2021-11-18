package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dao.DAOgetRegisted;
import model.AllRegisted;

@MultipartConfig
@WebServlet(urlPatterns = {"/export-data"})
public class ExportData extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\BTL\\SQL\\workspace\\dangkyhoc\\src\\main\\webapp\\file\\file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("dangkyhoc");
		XSSFRow row;
		List<AllRegisted> list =  DAOgetRegisted.getAll();
		
		for(int i=0; i< list.size();i++) {
			row = sheet.createRow((short) i);
			XSSFCell cell1 = row.createCell((short) 0);
			XSSFCell cell2 = row.createCell((short) 1);
			XSSFCell cell3 = row.createCell((short) 2);
			XSSFCell cell4 = row.createCell((short) 3);
			XSSFCell cell5 = row.createCell((short) 4);
			XSSFCell cell6 = row.createCell((short) 5);
			XSSFCell cell7 = row.createCell((short) 6);
			XSSFCell cell8 = row.createCell((short) 7);
			XSSFCell cell9 = row.createCell((short) 8);
			XSSFCell cell10 = row.createCell((short) 9);
			cell1.setCellValue(list.get(i).getId_sd());
			cell2.setCellValue(list.get(i).getId_sj());
			cell3.setCellValue(list.get(i).getSubjectName());
			cell4.setCellValue(list.get(i).getCredis());
			cell5.setCellValue(list.get(i).getClassName());
			cell6.setCellValue(list.get(i).getLecturerName());
			cell7.setCellValue(list.get(i).getStatus());
			cell8.setCellValue(list.get(i).getDate());
			cell9.setCellValue(list.get(i).getPeriod());
			cell10.setCellValue(list.get(i).getRoom());
		}
		workbook.write(file);
		workbook.close();
		file.close();
		resp.sendRedirect("admin");
	}
	
}
