

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JyankenServlet
 */
@WebServlet("/JyankenServlet")
public class JyankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JyankenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*humen*/
		String teHito = request.getParameter("te");
		/*computer*/
		double rand = Math.random();
		String teComp;
		if(rand <= 0.33333) {
			teComp = "グー";
		} else if(rand <= 0.66666) {
			teComp = "チョキ";
		} else {
			teComp = "パー";
		}
		/*勝負の判定*/
		String kekka;
		if (teComp.equals(teHito)) {
			kekka = "あいこ";
		} else if (teComp.equals("グー") && teHito.equals("チョキ")) {
			kekka = "コンピュータの勝ち";
		} else if (teComp.equals("チョキ") && teHito.equals("パー")) {
			kekka = "コンピュータの勝ち";
		} else if (teComp.equals("パー") && teHito.equals("グー")) {
			kekka = "コンピュータの勝ち";
		} else {
			kekka = "あなたの勝ち";
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>じゃんけんの結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>じゃんけんの結果</h1>");
		out.println("<p>CD６５−０２	１１８４ 		蒋皓<br/>");
		out.println("あなたが選ぶ手：" + teHito + "<br>");
		out.println("プログラムが選ぶ手：" + teComp + "<br>");
		out.println("勝負の結果は：" + kekka + "でした！");
		out.println("<p><a href=\"Jyanken.html\">もう一度やる</a>");
		out.println("<p><a href=\"index.htm\">ホームページへ</a>");
		out.println("</body></html>");
	}
}
