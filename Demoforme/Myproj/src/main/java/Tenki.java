

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tenki
 */
@WebServlet("/Tenki")
public class Tenki extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tenki() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title>お天気予想</title>");
		out.println("<body>");
		out.println("<h3>お天気予想</h3>");
		out.println("<h3>CD65-2 K020C1184 蔣晧</h3>");
		Random rd = new Random();
		int nextInt = rd.nextInt(3);//[0,3)
		switch(nextInt) {
		case 0:
			out.println("晴れ!");
			break;
		case 1:
			out.println("曇り");
			break;
		case 2:
			out.println("雨");
			break;
		}
		out.println("<h3>以上</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
