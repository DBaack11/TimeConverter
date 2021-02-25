package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TimeConverter;

/**
 * Servlet implementation class getMinutesServlet
 */
@WebServlet("/getMinutesServlet")
public class getMinutesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMinutesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMinutes = request.getParameter("userMinutes");
		
		TimeConverter userConverter = new TimeConverter(Integer.parseInt(userMinutes), "minutes");
		
		request.setAttribute("userConversion", userConverter);
		
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
	}

}
