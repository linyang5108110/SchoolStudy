package cn.linyang.StudyServlet;

import sun.misc.Request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletTest2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String contextName = req.getContextPath();


        String result =  req.getHeader("Referer");

        if(result != null && result.contains(contextName))
        {
            out.print("开始观看视频");

        }else {
            resp.sendRedirect("/school/error.html");
        }
    }
}
