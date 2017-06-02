

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		request.setCharacterEncoding("Windows-31J");
		response.setCharacterEncoding("Windows-31J");

		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String profession = request.getParameter("profession");
		String lang[] = request.getParameterValues("lang");
		String remarks = request.getParameter("remarks");

//		String list[] = request.getParameterValues("");

        PrintWriter pw = response.getWriter();

        pw.println("<!DOCTYPE html><html><head><title>個人情報サーブレット</title></head>");
        pw.println("<body>");
        pw.println("<h1>入力した内容</h1>");
        pw.println("<table>");
        pw.println("<tr>");
        pw.println("<td align='center'>名前：</td>");
        pw.println("<td>"+name+"</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td align='center'>性別：</td>");
        pw.println("<td>"+gender+"</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td align='center'>職業：</td>");
        pw.println("<td>"+profession+"</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td align='center'>可能言語：</td>");
        pw.println("<td>");
        for(int i=0;i<lang.length;i++){
            pw.println(lang[i]+" ");
        }
        pw.println("</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td align='center'>備考：</td>");
        pw.println("<td>"+remarks+"</td>");
        pw.println("</tr>");
        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");
	}

}
