package com.pac.demo.service;

import java.io.IOException;

import com.pac.demo.business.CartAddition;
import com.pac.demo.entity.Product;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addToCart")
public class CartController extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int qty=Integer.parseInt(req.getParameter("quantity"));
		int id = Integer.parseInt(req.getParameter("id"));
		String buttonClicked = req.getParameter("callToAction");
		Product ref = new Product(id,qty);
		
		CartAddition businesslog = new CartAddition();
		if(buttonClicked.equals("Add_to_Cart")) {
			String result = businesslog.addToCart(ref);
			if(result.equals("continue")) {
				res.sendRedirect("shoppingCart.html");
			}
			
		}
		else {
			businesslog.checkOut();
		}
	
//	public void service(HttpServletRequest req,HttpServletResponse res) {
//		String method = req.getMethod();
//		System.out.println(method);
//		
//		if(method.equals("POST")) {
////			executePost();
//			doPost(req, res);
//		}
//		else
//		{
////			executeGet();
//			doGet();
//		}
	
	}

}
