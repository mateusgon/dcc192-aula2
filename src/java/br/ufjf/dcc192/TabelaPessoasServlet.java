package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "TabelaPessoasServlet", urlPatterns = {"/tabela-pessoas.html"})
public class TabelaPessoasServlet extends HttpServlet{

    private final List<Pessoa> pessoas;
    
    public TabelaPessoasServlet()
    {
        pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Pedro", "@@", 20));
        pessoas.add(new Pessoa("Jão", "@@", 20));
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
            out.println("<table border=1>");
            for (Pessoa pessoa : pessoas)
            {
                out.println("<tr>");
                out.println("<td>" + pessoa.getNome() + "</td>");
                out.println("<td>" + pessoa.getIdade() + "</td>");
                out.println("<td>" + pessoa.getEmail() + "</td>");
                out.println("</tr>");
            }
            out.println("</body>");
            out.println("</html>");
            response.setContentType("text/html; charset=UTF-8");
        }    
    }
    
}
