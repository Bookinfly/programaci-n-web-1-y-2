const SUMAR = document.querySelector(".btn-aumentar")
const RESTAR = document.querySelector(".btn-disminuir")
const RESET = document.querySelector(".btn-reset")
const RESULTADO = document.querySelector("#resultado")

const SUMA = ()=> RESULTADO.textContent = parseInt(RESULTADO.textContent) + 1

const RESTA = ()=> RESULTADO.textContent -= 1

const RESETEAR = ()=> RESULTADO.textContent = 0

SUMAR.addEventListener('click', ()=>SUMA())
RESTAR.addEventListener('click', ()=>RESTA())
RESET.addEventListener('click', ()=>RESETEAR())

