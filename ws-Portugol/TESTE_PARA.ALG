Algoritmo "teste_para"
var

   N, i, x, soma : inteiro
   
inicio

      escreva("Quantos numeros serao digitados: ")
      leia(N)
      
      soma <- 0
      
      para i de 1 ate N faca

           escreva("Digite um numero: ")
           leia(x)
           soma <- soma + x
      fimpara
      
      escreval("Soma = ",soma)
      
Fimalgoritmo