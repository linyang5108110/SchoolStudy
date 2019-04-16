package cn.linyang.StudyServlet;

import sun.misc.Request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //假设账号名字必须的zhangsan 密码必须是123才算是正确
        String username = req.getParameter("username");
        String password = req.getParameter("password");


         if(null == username || username.equals(""))
         {
             req.getRequestDispatcher("/school/login.html").forward(req,resp);
         }
          if(null == password || password.equals(""))
         {
             req.getRequestDispatcher("/school/login.html").forward(req,resp);
         }
         if(username.equals("zhangsan") && password.equals("123"))
         {
             out.print("login success");
         }else {
//             resp.sendRedirect("/school/error.html");
         }


    }
}
