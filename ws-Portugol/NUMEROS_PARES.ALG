Algoritmo "numeros_pares"
var

   N, i, qtePares : inteiro
   vet: vetor[0..99] de inteiro
   
inicio

      escreva("Quantos numeros voce vai digitar: ")
      leia(N)
      
      para i de 0 ate N-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara
      
      qtePares <- 0
      
      escreval
      escreval("Numeros pares: ")
      para i de 0 ate N-1 faca
           se vet[i] % 2 = 0 entao
              escreva(vet[i], " ")
              qtePares <- qtePares + 1
           fimse
      fimpara
      
      escreval
      escreval("Quantidade de pares = ", qtePares)
      
Fimalgoritmo