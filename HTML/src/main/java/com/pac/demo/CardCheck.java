package com.pac.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cardverify") //URL pattern of the class
//where you are using url there should be a slash'/'
//where we are not using it there should not be a slash '/'
//http://localhost:8080/HTML/cardverify?cardnumber=a&cardholder=b&cardexpiry=c&cvv=d
//after ? it is known as query string
//if we want to do processing on server side then name is mandatory
//if we want to do processing on js side then id is mandatory

//service layer is working like the client
public class CardCheck extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String num = req.getParameter("cardnumber");
		String name = req.getParameter("cardholder");
		String exdate = req.getParameter("cardexpiry");
		String cvv = req.getParameter("cvv");
		
		Card object = new Card(num,name,exdate,cvv);
		
		CardVerification ref = new CardVerification();
		boolean isVerified = ref.verify(object);
		
		System.out.println("Card Deatils");
		System.out.println("Card Number : "+num+"Card Holder Name : "+name+"Expiry date : "+exdate+"CVV : "+cvv);
		PrintWriter out = res.getWriter();
//		out.println("Data Received");
		
		
		if(isVerified==true) {
			res.sendRedirect("http://www.google.com");
		}
		else {
			out.println("Card is not verified");
		}
		
		
	}
}
