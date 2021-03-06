package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "ListaPessoasServlet", urlPatterns = {"/pessoas.html"})
public class ListaPessoasServlet extends HttpServlet{

    private final List<String> pessoas;
    
    public ListaPessoasServlet()
    {
        pessoas = new ArrayList<String>();
        pessoas.add("Pedro");
        pessoas.add("Gabriel");
        pessoas.add("João");
        pessoas.add("Ricardo");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Relógio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Pessoas </h1>");
            out.println("<ul>");
            for (String pessoa : pessoas)
            {
                out.println("<li>" + pessoa + "</li>");
            }
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
            response.setContentType("text/html; charset=UTF-8");
        }    
    }
    
}
