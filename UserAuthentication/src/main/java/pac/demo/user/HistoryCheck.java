package pac.demo.user;


import java.io.IOException;
import java.io.PrintWriter;

//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/historyCheck")
public class HistoryCheck extends HttpServlet{
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("hello");
		
	}
	
}

