package com.vtb.kortunov.lesson20;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NumberServlet", urlPatterns = "/number.html")
public class NumberServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        int num = Integer.parseInt(req.getParameter("num"));
        out.println("<html><body><table><table border=\"1\">> ");
        for (int i = 1; i <= num; i++) {
            out.println("<tr>");
            for (int j = 1; j <= num; j++) {
                out.println("<td>  " + i + "-" + j + "  </td>");
            }
            out.println("</tr>");
        }
    }
}
