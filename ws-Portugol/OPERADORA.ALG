Algoritmo "operadora"
var

   minutos : inteiro
   valorPago: real
   
inicio

      escreva("Digite a quantidade de minutos: ")
      leia(minutos)
      
      valorPago <- 50
      se minutos > 100 entao
         valorPago <- valorPago + 2 *(minutos - 100)
      fimse
      
      escreval("Valor a se pagar: R$ ", valorPago:4:2)
Fimalgoritmo