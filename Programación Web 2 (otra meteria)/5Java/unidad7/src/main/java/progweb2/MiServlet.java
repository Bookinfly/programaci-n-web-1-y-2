package progweb2; 

import java.io.IOException; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/") 
public class MiServlet extends HttpServlet { 

    // @Override 
    // protected void doGet(HttpServletRequest request, 
    //         HttpServletResponse response) 
    //         throws ServletException, IOException { 
    //     response.setContentType("text/plain"); 
    //     response.getWriter().write("¡Hola mundo!"); 
    // } 

    @Override 
protected void doGet(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException { 
String name = request.getParameter("name"); 
response.setContentType("text/plain"); 
response.getWriter().write("¡Hola " + name + "!"); 
} 

} 