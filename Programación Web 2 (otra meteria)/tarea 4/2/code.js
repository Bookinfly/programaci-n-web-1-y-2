const BUTTON = document.getElementsByTagName("button")
const LIST = document.getElementsByTagName("ul")
BUTTON[0].addEventListener('click', ()=>AÑADIR_ELEMENTO())

const AÑADIR_ELEMENTO = ()=>{
  let elemento = document.createElement("li")
  elemento.textContent = "Elemento Añadido"
  LIST[0].append(elemento)
}