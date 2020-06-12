

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/myjava")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Gson gson = new Gson();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		employee e = new employee();
		e.setId(1);
		e.setName(request.getParameter("abc"));
		e.setName("Sachin");
		
		String empjsontostring = gson.toJson(e);
		
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(empjsontostring);
	}

}
