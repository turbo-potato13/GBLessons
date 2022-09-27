package com.vtb.kortunov.lesson20;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DataServlet", urlPatterns = "/data.html")
public class DataServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String paramSecondName = req.getParameter("secondName");
        String paramFirstName = req.getParameter("firstName");
        String paramPatronymic = req.getParameter("patronymic");
        String paramDob = req.getParameter("dob");
        String paramCity = req.getParameter("city");
        out.println("<html><body><table><table border=\"1\"> " +
            "<td> ФИО </td> <td> " + paramSecondName + " " + paramFirstName + " " + paramPatronymic + "</td> </tr>" +
            "<tr> <td> Дата рождения </td> <td>" + paramDob + "</td> </tr>" +
            "<tr> <td> Город проживания </td> <td>" + paramCity + "</td> </tr>" +
            "</table></body></html>");
        out.close();
    }

}
