Algoritmo "consumo"
var
    distancia, combustivel, consumo : real
    
inicio

    escreva("Distancia percorrida: ")
    leia(distancia)
    escreva("Combustivel gasto: ")
    leia(combustivel)
    
    consumo <- distancia / combustivel
    
    escreval("Consumo medio = ", consumo:5:3)
Fimalgoritmo