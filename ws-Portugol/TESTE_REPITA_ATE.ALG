Algoritmo "teste_repita_ate"
var

   C, F: real
   resp: caractere
   
inicio

      repita
            escreva("Digite a temperatura em celsius: ")
            leia(C)
            F <- 9 * C / 5 + 32
            escreval("Equivalente em Fahrenheit: ", F:3:1)
            escreva("Deseja repetir (s/n)? ")
            leia(resp)
      ate resp <> "s"
Fimalgoritmo