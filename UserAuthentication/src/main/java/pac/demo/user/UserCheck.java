package pac.demo.user;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/userAuth")
public class UserCheck extends HttpServlet{
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User obj = new User(username,password);
		
		UserIdentification ref  = new UserIdentification();
		boolean isVerified=ref.verify(obj);
		
		System.out.println("User Details");
		System.out.println("UserName : "+username+"Password : "+password);
		
		
		PrintWriter pw = res.getWriter();
		pw.println("Data Received");
		
		if(isVerified==true) {
			pw.println("User Verified");
		}
		else {
			pw.println("User Not Verified");
		}
		
	}
	
}
