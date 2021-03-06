

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KonyuServlet
 */
@WebServlet("/KonyuServlet")
public class KonyuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KonyuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		int tx1val = Integer.parseInt(request.getParameter("text1"));
		int tx2val = Integer.parseInt(request.getParameter("text2"));
		int tx3val = Integer.parseInt(request.getParameter("text3"));
		int tx4val = Integer.parseInt(request.getParameter("text4"));
		
		int lb1val = tx1val * 200 + tx2val * 300 + tx3val * 140 ;
		int lb2val = tx4val - lb1val ;
		
		request.setAttribute("label1", lb1val);
		request.setAttribute("label2", lb2val);
		
		getServletContext().getRequestDispatcher("/jihanki.jsp").forward(request, response);
		
	}

}
