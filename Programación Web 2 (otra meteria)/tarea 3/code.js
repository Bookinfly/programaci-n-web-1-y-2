let textoA = "Éste es un EJERCICIO de Javascript"
textoA = textoA.toUpperCase()
const SALIDA_CONVERSOR = document.querySelector('#salida_2')
const SALIDA_COMPARADOR = document.querySelector('#salida_1')
const INPUT_CENTIMETROS = document.querySelector('#conversor')
const INPUT_NUM = document.getElementById("numerin")
const BUTTON_1 = document.querySelector(".button--1")
const BUTTON_2 = document.querySelector(".button--2")

function alturaFormateada(centimetros) {
  metros = centimetros / 100
  console.log(metros)
  SALIDA_CONVERSOR.textContent = `${metros} M`
}

const verificadorDePares = (num)=> {
  if (num%2 == 0 && num !=0){
    console.log("Es par")
    SALIDA_COMPARADOR.textContent = "Es Par"
  } else {
    console.log("No es par")
    SALIDA_COMPARADOR.textContent = "No es Par"
  }
}

BUTTON_1.addEventListener('click', ()=>verificadorDePares(INPUT_NUM.value))
BUTTON_2.addEventListener('click', ()=>alturaFormateada(INPUT_CENTIMETROS.value))

console.log(textoA)

