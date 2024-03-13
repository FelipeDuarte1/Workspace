Algoritmo "divisao"

var
   N, i : inteiro
   x, y, divisao : real
   
inicio

      escreva("Quantos casos voce vai digitar? ")
      leia(N)
      
      para i de 1 ate N faca
           escreva("Entre com o numerador: ")
           leia(x)
           escreva("Entre com o denominador: ")
           leia(y)
           
           se y = 0 entao
              escreval("Divisao impossivel")
           senao
                divisao <- x / y
                escreval("Divisao = ", divisao:4:2)
           fimse
      fimpara


Fimalgoritmo