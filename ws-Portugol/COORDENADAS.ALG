Algoritmo "coordenadas"
var

   x, y : real
   
inicio

      escreva("Valor de X: ")
      leia(x)
      escreva("Valor de Y: ")
      leia(y)
      
      se(x > 0) e (y > 0) entao
           escreval("Q1")
      senao
           se(x < 0) e (y > 0) entao
                escreval("Q2")
           senao
                se(x < 0) e (y < 0) entao
                     escreval("Q3")
                senao
                     se(x > 0) e (y < 0) entao
                          escreval("Q4")
                     senao
                          se (x = 0) e (y = 0) entao
                             escreval("Origem")
                          senao
                          
                          fimse
                     fimse
                fimse
           fimse
      fimse

Fimalgoritmo