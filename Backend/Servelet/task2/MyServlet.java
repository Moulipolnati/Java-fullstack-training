package com.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		int p = Integer.parseInt(request.getParameter("phy"));
		int c = Integer.parseInt(request.getParameter("che"));
		int m = Integer.parseInt(request.getParameter("math"));
		
		float percentage = (p+c+m)/300F*100F;
		
		// sending data to MarksPer.jsp 
		request.setAttribute("phyMarks", p);
		request.setAttribute("cheMarks", c);
		request.setAttribute("mathMarks", m);
		request.setAttribute("percentage", percentage);
		
		RequestDispatcher rd = request.getRequestDispatcher("MarksPer.jsp");
		rd.forward(request, response);


		
	}

}
