<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

  <head>
    <meta charset="UTF-8">
    <title>Formulario de Compra</title>
  </head>
  <body>
    <h1>Realizar compra</h1>
    <form method="post" action="send">
      <label for="producto">Producto:</label>
      <select name="producto" id="producto">
        <option value="A">Producto A : a solo $1000 la unidad</option>
        <option value="B">Producto B : a solo $1500 la unidad</option>
        <option value="C">Producto C : a solo $3000 la unidad</option>
      </select>
      <br><br>
      <label for="cantidad">Cantidad:</label>
      <input type="number" name="cantidad" id="cantidad" min="1" required>
      <br><br>
      <button type="submit">Enviar</button>
    </form>
  </body>
</html>