package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TimeConverter;

/**
 * Servlet implementation class getSecondsServlet
 */
@WebServlet("/getSecondsServlet")
public class getSecondsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSecondsServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userSeconds = request.getParameter("userSeconds");
		
		TimeConverter userConverter = new TimeConverter(Integer.parseInt(userSeconds), "seconds");
		
		request.setAttribute("userConversion", userConverter);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}
