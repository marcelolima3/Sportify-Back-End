package web;

import beans.BeanLookup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s = request.getSession();
        s.removeAttribute("sportify/sportify.sportify.sportify.user");
        s.removeAttribute("pass");

        response.sendRedirect("/JavaWeb");

        //request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Object obj = JavaWeb.listGames();

        request.setAttribute("sportify.sportify.sportify.sportify.user-agent", request.getHeader("User-Agent"));

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
