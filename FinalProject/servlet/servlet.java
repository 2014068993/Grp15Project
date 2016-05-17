

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	subscriber sub;
	
    /**
     * Default constructor. 
     */
    public servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		subscriber(request, response);
		PrintWriter out = response.getWriter();
		
		out.print("<html><head> "
				+ "<center>Thank you for subsrcibing to our newsletter, "
				+ (sub.getEmail())
				+"<br><br>We hope to hear from you soon!!</center></font></head></html>");
		
	}
	protected void subscriber (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sub = new subscriber();
		sub.setEmail(request.getParameter("email"));
	}


}
