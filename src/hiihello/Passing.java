package hiihello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Passing extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String s1=req.getParameter("num1");

Integer a=Integer.parseInt(s1);
String s2=req.getParameter("num2");

Integer b=Integer.parseInt(s2);

Integer c=a+b;

PrintWriter out=resp.getWriter();
out.println("sum"+c);

	}
}
