package assignment2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleFormInput
 */
@WebServlet("/HandleFormInput")
public class HandleFormInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleFormInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("We are in doGet()");
		
		
		String firstName = request.getParameter("firstname"); 
		String lastName = request.getParameter("lastname");
		
		if (!firstName.isEmpty() && firstName != null && !lastName.isEmpty() && lastName != null) {
			request.setAttribute("firstname", firstName);
			request.setAttribute("lastname", lastName);
			request.getRequestDispatcher("ResponsePage.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

	@Override
	public void init() {
		System.out.println("Init Overrided");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy Overrided");
	}
}
