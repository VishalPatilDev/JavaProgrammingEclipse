package com.pac.ccw;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CoinCheck extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String country = req.getParameter("Country");
		String denomination = req.getParameter("Denomination");
		String yom = req.getParameter("YearOfMinting");
		String cv = req.getParameter("CurrentValue");
		String ad = req.getParameter("AcquiredDate");
		
		Coin obj = new Coin(country,denomination,yom,cv,ad);
		CoinVerification ref  = new CoinVerification();
		boolean isVerified=ref.verify(obj);
		
		PrintWriter pw = res.getWriter();
	
		
		if(isVerified ==true) {
			pw.println("successfull");
			
		}
		else {
			pw.println("unsuccessfull");
		}
	}

}

