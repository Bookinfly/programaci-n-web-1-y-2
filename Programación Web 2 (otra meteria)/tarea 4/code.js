const BODY = document.querySelector("body")
let box = document.createElement("div")
let boxSoon = document.createElement("div")
let boxSoon2 = document.createElement("div")
let list = document.createElement("ol")
let text = document.createElement("p")
let text2 = document.createElement("p")

text.textContent = "Code code code..."
text2.textContent = "Code code code...2"
list.innerHTML = "<li>elemento</li><li>elemento</li><li>elemento</li>"
box.id = "contenedor"
boxSoon.id = "primero"
boxSoon2.id = "segundo"
box.prepend(boxSoon)
boxSoon.append(list)
boxSoon.prepend(text)
boxSoon.append(text2)
box.append(boxSoon2)
boxSoon.style.backgroundColor = "red"
boxSoon.style.border = "solid blue 10px"
boxSoon2.style.backgroundColor = "yellow"
boxSoon2.style.border = "solid green 10px"
boxSoon2.style.margin = "20px"
boxSoon2.style.height = "100px"//agregado
BODY.append(box)





