// Escribir una función JavaScript que permita crear una caja (div) en el documento HTML e insertarla en el mismo. La función debe recibir los siguientes parámetros: alto, ancho, grosor del borde y color de fondo. La caja generada se debe ajustar a esos parámetros y todos deben ser establecidos mediante métodos del DOM.

const CREAR_DIV = (ancho, alto, grosorBorde, colorFondo)=>{
  let espacio = document.getElementsByTagName("body")[0]
  let cajita = document.createElement("div")
  cajita.style.width = ancho
  cajita.style.height = alto
  cajita.style.border = `solid black ${grosorBorde}`
  cajita.style.backgroundColor = colorFondo
  espacio.append(cajita)
}

CREAR_DIV("100px", "100px", "3px", "red")