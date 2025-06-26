package progweb2;

import java.io.IOException; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 
import java.time.LocalDate; 
import java.time.Period; 

@WebServlet("form") 
public class ProcessForm extends HttpServlet { 

    @Override 
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response) 
    throws ServletException, IOException { 
    String nombre = request.getParameter("nombre"); 
    String apellido = request.getParameter("apellido");
    LocalDate fechaNacimiento = LocalDate.parse( 
        request.getParameter("nacimiento")); 
    Integer edad = Period.between(fechaNacimiento, 
    LocalDate.now()).getYears(); 
    String mensaje = "Edad de " + nombre + " " + apellido + ": " + edad + " años.";
    request.setAttribute("msg", mensaje); 
    request.getRequestDispatcher("resultado.jsp"). 
    forward(request, response);
    } 
}