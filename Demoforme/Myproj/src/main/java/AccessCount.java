

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccessCount
 */
@WebServlet("/AccessCount")
public class AccessCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int accessCount = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		accessCount++;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>アクセスカウンタ</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>アクセスカウンター</h1>");
		out.println("<h3>CD65-2 K020C1184 蔣晧</h3>");
		out.println("あなたは：　" + accessCount + "人目の訪問者です！<p>");
		out.println("<p><a href=\"index.htm\">ホームページへ</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
