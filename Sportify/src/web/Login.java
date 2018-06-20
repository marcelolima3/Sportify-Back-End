package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession s = request.getSession();

        s.setAttribute("user", name);
        s.setAttribute("pass", password);

        response.sendRedirect("/JavaWeb");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s = request.getSession();

        String name = (String) s.getAttribute("sportify/sportify.user");
        String password = (String) s.getAttribute("pass");

        if (name == null)
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        else if(!JavaWeb.isRegistered(name, password))
            response.sendRedirect("/JavaWeb/User");
        else
            response.sendRedirect("/JavaWeb/Index");
    }
}
