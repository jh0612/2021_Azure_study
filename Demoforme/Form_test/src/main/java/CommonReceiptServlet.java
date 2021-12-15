

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommonReceiptServlet
 */
@WebServlet("/CommonReceiptServlet")
public class CommonReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommonReceiptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name = request.getParameter("onamae");
		PrintWriter out = response.getWriter();
		out.println("お名前は" + name + "さんですね");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setAttribute("setsume", "お名前は K020C1184蒋皓さんですね");
		String name = request.getParameter("onamae");
		PrintWriter out = response.getWriter();
		out.println("お名前は" + name + "さんですね");
	}

}
