package progweb2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/send")
public class EnviarDatos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String producto = request.getParameter("producto");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int precioUnitario = 0;

        switch (producto) {
            case "A":
                precioUnitario = 1000;
                break;
            case "B":
                precioUnitario = 1500;
                break;
            case "C":
                precioUnitario = 3000;
                break;
            default:
                response.getWriter().write("Producto inválido.");
                return;
        }

        int total = precioUnitario * cantidad;

        response.setContentType("text/html");
        response.getWriter().write(
            "<html><body>" +
            "<h1>Resumen de compra</h1>" +
            "<p>Producto: " + producto + "</p>" +
            "<p>Precio unitario: $" + precioUnitario + "</p>" +
            "<p>Cantidad: " + cantidad + "</p>" +
            "<p><strong>Total: $" + total + "</strong></p>" +
            "</body></html>"
        );
    }
}