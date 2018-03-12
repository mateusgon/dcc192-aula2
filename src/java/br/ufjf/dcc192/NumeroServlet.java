package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "NumeroServlet", urlPatterns = {"/numero.html", "/impares.html", "/pares.html"})
public class NumeroServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter())
        {
            int i;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Números</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Números </h1>");
            if(request.getServletPath().equals("/numero.html"))
            {
                for (i = 0; i <= 100; i++)
                {
                    out.println(i);
                    out.println("</br>");
                }
            }
            if(request.getServletPath().equals("/pares.html"))
            {
                for (i = 0; i <= 100; i++)
                {
                    if (i % 2 == 0)
                    {
                        out.println(i);
                        out.println("</br>");
                    }
                }
            }
            if(request.getServletPath().equals("/impares.html"))
            {
                for (i = 0; i <= 100; i++)
                {
                    if (i % 2 != 0)
                    {
                        out.println(i);
                        out.println("</br>");
                    }
                }
            }
            out.println("</body>");
            out.println("</html>");
            response.setContentType("text/html; charset=UTF-8");
        }
    }
    
}
