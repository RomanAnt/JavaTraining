package org.art.practicaljava.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.art.practicaljava.dto.Query;
import org.art.practicaljava.models.MyJavaBean;
import org.art.practicaljava.services.StockPriceGen;


@WebServlet("/stock")
public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		ServletContext app = getServletContext();

		MyJavaBean sessionJBean = (MyJavaBean) session.getAttribute("jsessionbean");
		if (sessionJBean==null){
			sessionJBean = new MyJavaBean();
		}
		
		MyJavaBean appJBean = (MyJavaBean) app.getAttribute("jappbean");
		if (appJBean==null){
			appJBean = new MyJavaBean();
		}
		
		String stockName = request.getParameter("stockname");
		if (stockName==null || stockName.trim()=="" || stockName.isEmpty() || StockPriceGen.getQuote(stockName)==null) {
			response.sendRedirect("error.jsp");
			return;
		}else{
			
			String price = StockPriceGen.getQuote(stockName);
			
			Query currentQuery = new Query(new Date(), stockName, price);
			
			sessionJBean.getQueries().add(currentQuery);
			appJBean.getQueries().add(currentQuery);
			
			session.setAttribute("jsessionbean", sessionJBean);
			app.setAttribute("jappbean", appJBean);
			
			response.sendRedirect("stockresult.jsp");
			return;
		}
	}
}
