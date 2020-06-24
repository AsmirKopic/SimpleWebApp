package com.SimpleWebApp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class QuestionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//correct answers count
		int count=0;
		
		//correct answer
		String answer = request.getParameter("q1");
			if (answer.equals("a")){
				count+=1;
			}
			//option for negative points for wrong answer
			 if (answer.equals("b") || answer.equals("c")) {  
				count-=20; 
			} 
			
		
		request.setAttribute("answers", count);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		view.forward(request, response);
		
		
		
	}

}
