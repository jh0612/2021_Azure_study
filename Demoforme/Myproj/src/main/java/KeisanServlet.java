import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KeisanServlet
 */
@WebServlet("/KeisanServlet")
public class KeisanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeisanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strKazu1 = request.getParameter("kazu1");
		int kazu1 = Integer.parseInt(strKazu1);
		String strKazu2 = request.getParameter("kazu2");
		int kazu2 = Integer.parseInt(strKazu2);
		String syori = request.getParameter("syurui");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>四則演算結果</title></head>");
		out.println("<body>");
		out.println("<h1>四則演算の結果</h1>");
		out.println("<h3>CD65-2 K020C1184 蔣晧</h3>");
		out.println("<blockquote><table>");
		out.println("<tr><td>数字 1 つ目</td><td></td><td>数字 2 つ目</td><td></td><td>結果</td></tr>");
		out.println("<tr style=\"text-align: center\"><td>"
		+ kazu1 + "</td><td>");
		switch (syori) {
			case "tasu": out.print("+");break;
			case "hiku": out.print("-");break;
			case "kake": out.print("×");break;
			case "wari": out.print("÷");break;
		}
		out.println("</td><td>" + kazu2 + "</td><td>=</td><td>");
		switch (syori) {
			case "tasu":out.print(kazu1 + kazu2);break;
			case "hiku":out.print(kazu1 - kazu2);break;
			case "kake":out.print(kazu1 * kazu2);break;
			case "wari":out.print(kazu1 / kazu2);break;
		}
		out.println("</td></tr></table></blockquote>");
		out.println("<p><a href=\"index.htm\">ホームページへ</a>");
		out.println("</body></html>");
		}
}
