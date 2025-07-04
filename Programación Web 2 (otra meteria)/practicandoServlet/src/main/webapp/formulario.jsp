<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
  <head> 
     <meta charset="UTF-8"> 
     <title>Formulario de ejemplo</title> 
  </head> 
  <body> 
    <h1>Completa los datos</h1> 
    <form method="post" action="form"> 
      <div> 
        <label for="nombre_input">Nombre:</label> 
        <input type="text" id="nombre_input" name="nombre"> 
      </div> 
      <div> 
        <label for="apellido_input">Apellido:</label> 
        <input type="text" id="apellido_input" name="apellido"> 
      </div> 
      <div> 
        <label for="nacimiento_input">Fecha de nacimiento:</label> 
        <input type="date" id="nacimiento_input" name="nacimiento"> 
      </div> 
      <button type="submit">Enviar datos</button> 
    </form> 
  </body> 
</html> 