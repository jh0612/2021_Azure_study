import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KazuateServlet
 */
@WebServlet("/KazuateServlet")
public class KazuateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int kaisu = 0;
	int rd = (int)(Math.random() * 9d) + 1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KazuateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enteredKazuString = request.getParameter("kazu");
		String enteredKazu = String.valueOf(rd);
		String kekka  = "";
		if(enteredKazu.equals(enteredKazuString)) {
			kekka = "当たり";
		} else {
			kekka = "はずれ～！";
		}
		kaisu++;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>数当てゲーム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>数当てゲーム</h1>");
		out.println("<h3>CD65-2 K020C1184 蔣晧</h3>");
		out.println(kaisu + "回目　あなたが選んだ数：　" + enteredKazuString + "<br/>");
		out.println("<br/>");
		out.println("結果は：　" + kekka);
		out.println("<p><a href=\"kazuate.htm\">もう一度やる</a>");
		out.println("<p><a href=\"index.htm\">ホームページへ</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
