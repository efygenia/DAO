package web;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Dao;


@WebServlet(name = "Computadora", urlPatterns = {"/Computadora"})
public class Computadora extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); 
        System.out.println("Llegaste al DoGet");
               
        ArrayList respuesta= Dao.obtener();
        resp.getWriter().println(respuesta);
    }
    
    
}
