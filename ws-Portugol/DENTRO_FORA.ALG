Algoritmo "dentro_fora"
var

   N, X, i, dentro, fora : inteiro
   
inicio

      dentro <- 0
      fora <- 0
      
      escreva("Quantos numeros voce vai digitar? ")
      leia(N)
      
      para i de 1 ate N faca
      
           escreva("Digite um numero: ")
           leia(X)
           
           se (X >= 10) e (X <= 20) entao
              dentro <- dentro + 1
           senao
                fora <- fora + 1
           fimse
      fimpara
      
      escreval(dentro, " dentro")
      escreval(fora, " fora")
Fimalgoritmo