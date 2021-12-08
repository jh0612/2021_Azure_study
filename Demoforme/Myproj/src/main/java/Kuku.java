

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kuku
 */
@WebServlet("/Kuku")
public class Kuku extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kuku() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title>九九の表</title>");
		out.println("<body>");
		out.println("<h3>九九の表</h3>");
		out.println("<h3>CD65-2 K020C1184 蔣晧</h3>");
		out.println("<table border=border=\"1\">");
		out.println("<tr><td></td>");
		int i = 1;
		for (i = 1;i <= 9;i++) {
			out.println("<th>" + i + "</th>");
		}
			for(i = 1;i <= 9;i++) {
				out.println("<tr>");
				out.println("<td>" + i + "</td>");
				int j = 1;
				while (j <= 9){
					out.println("<td>");
					out.println(i + "*" + j + "=" + i*j);
					out.println("</td>");
					j++;
					}
				out.println("</tr>");
					}
		out.println("</table>");
		out.println("<h3>以上</h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
